package com.phuc.casestudy_module4_furamaresort.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "contract")
public class ContractController {
    @GetMapping(value = "")
    public String showListContract(){
        return "contract_list";
    }
}
