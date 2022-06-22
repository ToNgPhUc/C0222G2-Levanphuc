package com.phuc.controller;

import com.phuc.model.Customer;
import com.phuc.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value = "/customer")
public class CustomerController {
    @Autowired
   private ICustomerService iCustomerService;

@GetMapping(value = "")
    public String showList(Model model){
    List<Customer>customerList= iCustomerService.findAll();
    model.addAttribute("customerList",customerList);
        return "form_list";
    }
}
