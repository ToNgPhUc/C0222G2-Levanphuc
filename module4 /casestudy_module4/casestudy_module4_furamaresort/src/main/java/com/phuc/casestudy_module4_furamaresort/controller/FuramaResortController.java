package com.phuc.casestudy_module4_furamaresort.controller;

import com.phuc.casestudy_module4_furamaresort.model.Facility;
import com.phuc.casestudy_module4_furamaresort.service.IFacilityService;
import com.phuc.casestudy_module4_furamaresort.service.IFacilityTypeService;
import com.phuc.casestudy_module4_furamaresort.service.IRentTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping(value = "/resort")
public class FuramaResortController {
    @Autowired
    private IFacilityService iFacilityService;
    @Autowired
    private IFacilityTypeService iFacilityTypeService;
    @Autowired
    private IRentTypeService iRentTypeService;

    @GetMapping(value = "")
    public String home() {
        return "home";
    }
    @GetMapping(value = "facility")
    public String showFacilityList(Model model,
                                   @PageableDefault(value = 3) Pageable pageable,
                                   @RequestParam Optional<String>keyword) {
        String keywordVal = keyword.orElse("");
        Page<Facility> facilityList= this.iFacilityService.findAllByName(pageable,keywordVal);
        model.addAttribute("facilityList",facilityList);
        model.addAttribute("keywordVal",keywordVal);
        return "facility_list";
    }
    @GetMapping(value = "create")
    public String showFormCreate(Model model){
        model.addAttribute("facilityOject",new Facility());
        model.addAttribute("rentTypeList",this.iRentTypeService.findAll());
        model.addAttribute("facilityTypeList",this.iFacilityTypeService.findAll());
        return "create";
    }
    @PostMapping(value = "save")
    public String createFacility(@ModelAttribute Facility facility){
        iFacilityService.save(facility);
        return "redirect:/resort/facility";
    }
}
