package com.phuc.controller;

import com.phuc.service.ICalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class CalculatorController {
    @Autowired
    private ICalculatorService iCalculatorService;

    @GetMapping(value = "form_calculator")
    public String calculator() {
        return "form_calculator";
    }

    @PostMapping(value = "save")
    public String result(@RequestParam String operation, Model model, @RequestParam double a,
                         @RequestParam double b) {
        double calculator = this.iCalculatorService.calculator(a, b, operation);
        model.addAttribute("calculator", calculator);
        return "form_calculator";
    }

}
