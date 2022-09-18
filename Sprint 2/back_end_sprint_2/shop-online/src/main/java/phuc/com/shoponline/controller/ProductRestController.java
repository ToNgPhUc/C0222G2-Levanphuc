package phuc.com.shoponline.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;
import phuc.com.shoponline.dto.ProductDto;
import phuc.com.shoponline.model.product.Product;
import phuc.com.shoponline.service.product.IproductService;

import javax.validation.Valid;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/product")
public class ProductRestController {
    @Autowired
    private IproductService iproductService;
    @GetMapping(value = "/product-search")
    public ResponseEntity<Page<Product>> getAllProduct(@PageableDefault(12) Pageable pageable,
                                                       @RequestParam("searchName") Optional<String> search){

        String searchName = search.orElse("");
        Page<Product> productPage = this.iproductService.findAllProductByName(pageable,searchName);
        if (productPage.isEmpty()){
            return new ResponseEntity<>(productPage, HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(productPage, HttpStatus.OK);
        }
    }

//    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    @PostMapping (value = "/create-product")
    public ResponseEntity<FieldError> createProduct(@Valid @RequestBody ProductDto productDto,
                                                    BindingResult bindingResult){

        productDto.setProductList(this.iproductService.findAll());
        productDto.validate(productDto, bindingResult);

        if (bindingResult.hasErrors()){
            return new ResponseEntity<>(bindingResult.getFieldError(),HttpStatus.INTERNAL_SERVER_ERROR);
        }
        Product product= new Product();
        BeanUtils.copyProperties(productDto,product);
        iproductService.save(product);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @GetMapping(value = "/detail/{id}")
    public ResponseEntity<Product>DetailProduct(@PathVariable int id){
       Product product  = iproductService.findByIdProduct(id);
        if (product == null){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(product,HttpStatus.OK);
    }
    @GetMapping(value = "/new-product")
    public ResponseEntity<List<Product>> getNewProduct(){
        List<Product> productList = iproductService.newProduct();
        if (productList.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }return new ResponseEntity<>(productList,HttpStatus.OK);
    }


}
