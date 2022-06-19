package com.phuc.controller;

import com.phuc.model.MedicalDeclaration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MedicalDeclarationController {
    @GetMapping(value = "/form")
    public String showForm(Model model){
        model.addAttribute("medicalDeclaration",new MedicalDeclaration());
        return "show_form";
    }
    @PostMapping(value="save")
    public String result(Model model, MedicalDeclaration medicalDeclaration){
        model.addAttribute("name",medicalDeclaration.getName());
        model.addAttribute("birthday",medicalDeclaration.getBirthday());
        model.addAttribute("gender",medicalDeclaration.getGender());
        model.addAttribute("nationality",medicalDeclaration.getNationality());
        model.addAttribute("idCard",medicalDeclaration.getIdCard());
        model.addAttribute("vehicle",medicalDeclaration.getVehicle());
        model.addAttribute("vehicleNumber",medicalDeclaration.getVehicleNumber());
        model.addAttribute("seats",medicalDeclaration.getSeats());
        model.addAttribute("departureDay",medicalDeclaration.getDepartureDay());
        model.addAttribute("endDate",medicalDeclaration.getEndDate());
        model.addAttribute("information",medicalDeclaration.getInformation());
        return "result";
    }

}
