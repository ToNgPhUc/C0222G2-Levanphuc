package com.phuc.validate_quan_li_san_pham_ss8.controller;

import com.phuc.validate_quan_li_san_pham_ss8.dto.ProductDto;
import com.phuc.validate_quan_li_san_pham_ss8.model.Product;
import com.phuc.validate_quan_li_san_pham_ss8.service.IProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.Optional;

@Controller
@RequestMapping(value = "/product")
public class ProductController {
    @Autowired
    private IProductService iProductService;

    @GetMapping(value = "")
    public String showList(Model model,
                           @PageableDefault(value = 3) Pageable pageable,
                           @RequestParam Optional<String> search) {

        String searchType = search.orElse("");

        Page<Product> productList = this.iProductService.findByName(searchType, pageable);
        model.addAttribute("productList", productList);
        model.addAttribute("searchType", searchType);
        return "/product_list";
    }

    @GetMapping(value = "create")
    public String showFormCreate(Model model) {
        model.addAttribute("productDto", new ProductDto());
        return "/create";
    }

    @PostMapping(value = "save")
    public String createProduct(@Valid @ModelAttribute("productDto") ProductDto productDto,
                                BindingResult bindingResult,
                                RedirectAttributes redirectAttributes) {
        if (bindingResult.hasErrors()) {
            return "/create";
        } else {
            Product product= new Product();
            BeanUtils.copyProperties(productDto,product);
            this.iProductService.save(product);
            redirectAttributes.addFlashAttribute("success", "Register success!");
        }
        return "redirect:/product";
    }

    @GetMapping(value = "/{idProduct}/edit")
    public String showFormEdit(@PathVariable int idProduct, Model model) {
        Product product= iProductService.findByIdProduct(idProduct);
        ProductDto productDto= new ProductDto();
        BeanUtils.copyProperties(product,productDto);
        model.addAttribute("productDto", productDto);
        return "/edit";
    }

    @PostMapping(value = "edit")
    public String editProduct(@Valid @ModelAttribute("productDto") ProductDto productDto,
                                BindingResult bindingResult,
                                RedirectAttributes redirectAttributes) {
        if (bindingResult.hasErrors()) {
            return "/edit";
        } else {
            Product product=new Product();
            BeanUtils.copyProperties(productDto,product);
            this.iProductService.save(product);
            redirectAttributes.addFlashAttribute("success", "Register success!");
        }
        return "redirect:/product";
    }

    @GetMapping(value = "/{idProduct}/delete")
    public String showFormDelete(@PathVariable int idProduct, Model model) {
        model.addAttribute("product", iProductService.findByIdProduct(idProduct));
        return "/delete";
    }

    @PostMapping(value = "/delete")
    public String deleteBlog(@ModelAttribute Product product) {
        iProductService.deleteById(product.getIdProduct());
        return "redirect:/product";
    }

    @GetMapping("/{idProduct}/view")
    public String view(@PathVariable int idProduct, Model model) {
        model.addAttribute("product", iProductService.findByIdProduct(idProduct));
        return "view";
    }
}
