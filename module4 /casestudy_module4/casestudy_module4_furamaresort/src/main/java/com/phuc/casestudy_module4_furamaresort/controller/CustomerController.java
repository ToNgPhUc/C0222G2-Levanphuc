package com.phuc.casestudy_module4_furamaresort.controller;

import com.phuc.casestudy_module4_furamaresort.model.customer.Customer;
import com.phuc.casestudy_module4_furamaresort.model.facility.Facility;
import com.phuc.casestudy_module4_furamaresort.service.ICustomerService;
import com.phuc.casestudy_module4_furamaresort.service.ICustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
@RequestMapping(value = "/customer")
public class CustomerController {
    @Autowired
    private ICustomerService iCustomerService;
    @Autowired
    private ICustomerTypeService iCustomerTypeService;
    @GetMapping(value = "")
    public String showListCustomer(Model model,
        @PageableDefault(value = 3) Pageable pageable,
                                   @RequestParam Optional<String> keyword) {
            String keywordVal = keyword.orElse("");
            Page<Customer> customerList = this.iCustomerService.findAllByName(keywordVal, pageable);
            model.addAttribute("customerList", customerList);
            model.addAttribute("keywordVal", keywordVal);
        return "customer_list";
    }
    @GetMapping(value = "create")
    public String showFormCreate(){
        return "customer_create";
    }
    @GetMapping(value = "edit")
    public String showFormEdit(){
        return "customer_edit";
    }

}
