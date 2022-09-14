package phuc.com.shoponline.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import phuc.com.shoponline.model.product.TypeProduct;
import phuc.com.shoponline.service.product.ITypeProductService;

import java.util.List;

@Controller
@CrossOrigin
@RequestMapping("/type-product")
public class TypeProductRestController {
    @Autowired
    private ITypeProductService iTypeProductService;

    /**
     * @function ( get all List of the dishType )
     * @creator PhucLV
     * @date-create 10/08/2022
     * @return true: list   status 200
     */
    @GetMapping("/list-type-product")
    public ResponseEntity<List<TypeProduct>> getAllTypeProduct() {
        List<TypeProduct> typeProducts = this.iTypeProductService.getAllListDishType();
        return new ResponseEntity<>(typeProducts, HttpStatus.OK);
    }
}
