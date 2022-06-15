package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Convert {
    @GetMapping(value = "/core")
    public String convert(@RequestParam int vnd,Model model ){
model.addAttribute("usd",vnd*23000);
model.addAttribute("vnd",vnd);
        return "/convert";
    }
}
