package com.phuc.controller;

import com.phuc.model.Product;
import com.phuc.service.IProductService;
import com.phuc.service.ProductServiceIplm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller

@RequestMapping(value = "/product")
public class ProductController {
    private IProductService iProductService = new ProductServiceIplm();

    @RequestMapping(value = "")
    public String showList(Model model) {
        List<Product> productList = iProductService.finAll();
        model.addAttribute("productList", productList);
        return "/product_list";
    }
    @GetMapping(value = "/create")
    public String showFormCreate(Model model){
        model.addAttribute("product",new Product());
        return "/create";
    }
    @PostMapping(value = "/save")
    public  String saveProduct(Product product){
      product.setIdProduct((int) (Math.random()*100));
      iProductService.save(product);
        return "redirect:/product";
    }
    @GetMapping(value = "/{idProduct}/edit")
    public String showFormEdit(@PathVariable int idProduct,  Model model ){
        model.addAttribute("product",iProductService.findById(idProduct));
        return "/edit";
    }
    @PostMapping(value = "/edit")
    public String editProduct( Product product){
        iProductService.edit(product.getIdProduct(), product);
        return "redirect:/product";
    }
    @GetMapping(value = "/{idProduct}/delete")
    public String showFormDelete( @PathVariable int idProduct, Model model){
        model.addAttribute("product",iProductService.findById(idProduct));
        return "/delete";
    }

    @PostMapping(value = "/delete")
    public String deleteProduct( Product product){
        iProductService.delete(product.getIdProduct());
        return "redirect:/product";
    }
    @GetMapping(value = "/{idProduct}/view")
    public String view(@PathVariable int idProduct, Model model){
        model.addAttribute("product",iProductService.findById(idProduct));
        return "/view";
    }
    @GetMapping (value = "/search")
    public String search(@RequestParam String nameProduct, Model model){
        List<Product> productList=iProductService.searchByName(nameProduct);
        model.addAttribute("productList",productList);
        return "/product_list";
    }


}
