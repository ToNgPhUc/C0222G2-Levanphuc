package com.phuc.controller;

import com.phuc.model.Product;
import com.phuc.service.IProductService;
import com.phuc.service.iplm.ProductServiceIplm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller

@RequestMapping(value = "/product")
public class ProductController {
    @Autowired
    private IProductService iProductService ;

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
    @PostMapping(value = "save")
    public String create(@ModelAttribute Product product) {
        iProductService.save(product);
        return "redirect:/product";
    }
    @GetMapping(value = "/{idProduct}/edit")
    public String showFormEdit(@PathVariable int idProduct, Model model ){
        model.addAttribute("product",iProductService.findById(idProduct));
        return "/edit";
    }
    @PostMapping(value = "/edit")
    public String edit( @ModelAttribute Product product){
        iProductService.edit(product);
        return "redirect:/product";
    }
    @GetMapping(value = "/{idProduct}/delete")
    public String showFormDelete( @PathVariable int idProduct, Model model){
        model.addAttribute("product",iProductService.findById(idProduct));
        return "/delete";
    }

    @PostMapping(value = "/delete")
    public String deleteProduct( @ModelAttribute Product product){
        iProductService.delete(product.getIdProduct());
        return "redirect:/product";
    }



}
