package com.phuc.controller;

import com.phuc.model.MailConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MailConfigurationController {

    @GetMapping(value = "/form")
    public String showForm(Model model){
        model.addAttribute("mailConfiguration" ,new MailConfiguration());
        return "show_form";
    }

    @PostMapping(value = "/save")
    public String create(
            @ModelAttribute ("mailConfiguration") MailConfiguration mailConfiguration,Model model
    ){
        model.addAttribute("language",mailConfiguration.getLanguage());
        model.addAttribute("pageSize",mailConfiguration.getPageSize());
        model.addAttribute("spamFilter",mailConfiguration.getSpamFilter());
        model.addAttribute("signature",mailConfiguration.getSignature());
        return "result";
    }
}

