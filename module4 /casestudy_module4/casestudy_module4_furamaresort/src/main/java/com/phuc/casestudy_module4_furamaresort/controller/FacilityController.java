package com.phuc.casestudy_module4_furamaresort.controller;

import com.phuc.casestudy_module4_furamaresort.model.dto.FacilityDto;
import com.phuc.casestudy_module4_furamaresort.model.facility.Facility;
import com.phuc.casestudy_module4_furamaresort.service.IFacilityService;
import com.phuc.casestudy_module4_furamaresort.service.IFacilityTypeService;
import com.phuc.casestudy_module4_furamaresort.service.IRentTypeService;
import org.springframework.beans.BeanUtils;
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
public class FacilityController {
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
                                   @RequestParam Optional<String> keyword) {
        String keywordVal = keyword.orElse("");
        Page<Facility> facilityList = this.iFacilityService.findAllByName(keywordVal, pageable);
        model.addAttribute("facilityList", facilityList);
        model.addAttribute("keywordVal", keywordVal);
        return "facility_list";
    }

    @GetMapping(value = "create")
    public String showFormCreate(Model model) {
        model.addAttribute("facilityDto", new FacilityDto());
        model.addAttribute("rentTypeList", this.iRentTypeService.findAll());
        model.addAttribute("facilityTypeList", this.iFacilityTypeService.findAll());
        return "facility_create";
    }

    @PostMapping(value = "save")
    public String createFacility(@ModelAttribute FacilityDto facilityDto) {
        Facility facility= new Facility();
        BeanUtils.copyProperties(facilityDto,facility);
        iFacilityService.save(facility);
        return "redirect:/resort/facility";
    }

    @GetMapping(value = "/{id}/edit")
    public String showFormEdit(Model model, @PathVariable int id) {
        model.addAttribute("facilityOject", this.iFacilityService.findByIdFacility(id));
        model.addAttribute("rentTypeList", this.iRentTypeService.findAll());
        model.addAttribute("facilityTypeList", this.iFacilityTypeService.findAll());
        return "facility_edit";
    }

    @PostMapping(value = "/edit")
    public String edit(@ModelAttribute Facility facility) {
        this.iFacilityService.save(facility);
        return "redirect:/resort/facility";
    }

    @GetMapping(value = "/{id}/delete")
    public String delete(@PathVariable Integer id) {
        this.iFacilityService.delete(id);
        return "redirect:/resort/facility";
    }

}
