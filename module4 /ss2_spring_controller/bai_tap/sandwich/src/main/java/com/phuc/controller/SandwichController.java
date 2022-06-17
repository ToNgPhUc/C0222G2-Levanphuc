package com.phuc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;

@Controller
public class SandwichController {

    @GetMapping(value = "/showForm")
    public String sandwichForm() {
        return "form_sandwich";
    }

    @PostMapping("/save")
    public String save(
            @RequestParam String[] condiment,
            Model model
    ) {
        model.addAttribute("result", Arrays.toString(condiment));
        return "result";
    }
}
