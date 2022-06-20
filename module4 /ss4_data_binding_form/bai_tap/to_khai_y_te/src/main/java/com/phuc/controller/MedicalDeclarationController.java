package com.phuc.controller;

import com.phuc.model.MedicalDeclaration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MedicalDeclarationController {
    @GetMapping(value = "/form")
    public String showForm(Model model){
        model.addAttribute("medicalDeclaration",new MedicalDeclaration());
        return "show_form";
    }
    @PostMapping(value="save")
    public String result(Model model, @ModelAttribute MedicalDeclaration medicalDeclaration){
        model.addAttribute("medicalDeclaration",medicalDeclaration);
        return "redirect:/form";
    }

}
