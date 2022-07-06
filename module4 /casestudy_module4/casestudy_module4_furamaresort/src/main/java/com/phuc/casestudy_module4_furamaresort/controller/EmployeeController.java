package com.phuc.casestudy_module4_furamaresort.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping(value = "/employee")
public class EmployeeController {
    @GetMapping(value = "")
    public String showListEmployee(){
        return "employee_list";
    }

    @GetMapping(value = "create")
    public String showFormCreate(){
        return "employee_create";
    }

    @GetMapping(value = "edit")
    public String showFormEdit(){
        return "employee_edit";
    }
}
