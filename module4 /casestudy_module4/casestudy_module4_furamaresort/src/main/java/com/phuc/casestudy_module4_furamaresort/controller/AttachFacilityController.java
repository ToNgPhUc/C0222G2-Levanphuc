package com.phuc.casestudy_module4_furamaresort.controller;

import com.phuc.casestudy_module4_furamaresort.model.contract.AttachFacility;
import com.phuc.casestudy_module4_furamaresort.service.IAttachFacilityService;
import com.phuc.casestudy_module4_furamaresort.service.IContractDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
@RequestMapping(value = "attachFacility")
public class AttachFacilityController {
    @Autowired
    private IAttachFacilityService iAttachFacilityService;
    @Autowired
    private IContractDetailService iContractDetailService;

    @GetMapping(value = "")
    public String showListContract(Model model,
                                   @PageableDefault(value = 4) Pageable pageable,
                                   @RequestParam Optional<String> keyword){
        String keywordVal= keyword.orElse("");
        Page<AttachFacility> attachFacilityList = this.iAttachFacilityService.findByName(keywordVal,pageable);
        model.addAttribute("attachFacilityList",attachFacilityList);
        model.addAttribute("keywordVal",keywordVal);
        return "contract_detail_list";
    }
}
