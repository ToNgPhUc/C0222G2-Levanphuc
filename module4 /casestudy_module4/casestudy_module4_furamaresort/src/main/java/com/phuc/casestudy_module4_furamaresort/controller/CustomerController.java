package com.phuc.casestudy_module4_furamaresort.controller;

import com.phuc.casestudy_module4_furamaresort.model.customer.Customer;
import com.phuc.casestudy_module4_furamaresort.model.customer.CustomerType;
import com.phuc.casestudy_module4_furamaresort.model.dto.CustomerDto;
import com.phuc.casestudy_module4_furamaresort.service.ICustomerService;
import com.phuc.casestudy_module4_furamaresort.service.ICustomerTypeService;
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
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping(value = "/customer")
public class CustomerController {
    @Autowired
    private ICustomerService iCustomerService;
    @Autowired
    private ICustomerTypeService iCustomerTypeService;
                        // giúp tạo customerType có thể gửi đến tất cả phương thức của controller

                        //    @ModelAttribute(value = "customerTypeList")
                        //    public List<CustomerType> getAllCustomerType(){
                        //        return this.iCustomerTypeService.findAll();
                        //    }

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
    public String showFormCreate( Model model){
        model.addAttribute("customerTypeList",this.iCustomerTypeService.findAll());
        model.addAttribute("customerDto",new CustomerDto());
        return "customer_create";
    }

    @PostMapping(value = "save")
    public String saveCustomer(@Valid @ModelAttribute CustomerDto customerDto, BindingResult bindingResult,
           Model model){
        if (bindingResult.hasErrors()){
            model.addAttribute("customerTypeList",this.iCustomerTypeService.findAll());
            return "customer_create";
        }
        Customer customer= new Customer();
        BeanUtils.copyProperties(customerDto, customer);
        iCustomerService.save(customer);
        return "redirect:/customer";
    }

    @GetMapping(value = "/{id}/edit")
    public String showFormEdit(@PathVariable int id, Model model){
        model.addAttribute("customerTypeList",this.iCustomerTypeService.findAll());
        model.addAttribute("customer",this.iCustomerService.findByIdCustomer(id));
        return "customer_edit";
    }

    @PostMapping(value = "/edit")
    public String edit(@ModelAttribute Customer customer){
        iCustomerService.save(customer);
        return "redirect:/customer";
    }

    @GetMapping(value = "/{id}/delete")
    String delete (@PathVariable int id){
        iCustomerService.delete(id);
        return "redirect:/customer";
    }

}
