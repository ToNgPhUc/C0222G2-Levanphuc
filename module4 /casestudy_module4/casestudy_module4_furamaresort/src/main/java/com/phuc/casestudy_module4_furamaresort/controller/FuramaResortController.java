package com.phuc.casestudy_module4_furamaresort.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "resort")
public class FuramaResortController {
@GetMapping(value = "")
    public String home(){
    return "home_furama_resort";
}
}
