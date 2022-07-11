package com.phuc.casestudy_module4_furamaresort.controller;

import com.phuc.casestudy_module4_furamaresort.model.customer.Customer;
import com.phuc.casestudy_module4_furamaresort.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
@RequestMapping(value = "customerUserFacility")
public class CustomerUserFacilityController {
    @Autowired
    private ICustomerService customerService;
    @GetMapping(value = "")
    public String showListCustomerUserFacility(Model model, @PageableDefault(value = 3) Pageable pageable,
                                               @RequestParam Optional<String> keyword ) {
        String keywordVal = keyword.orElse("");
        Page<Customer> customerPage= this.customerService.findByNameCustomerUserFacility(keywordVal,pageable);
        model.addAttribute("customerPage",customerPage);
        model.addAttribute("keywordVal",keywordVal);
        return "customer_user_facility";
    }
}
