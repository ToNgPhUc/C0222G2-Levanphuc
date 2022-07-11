package com.phuc.casestudy_module4_furamaresort.controller;

import com.phuc.casestudy_module4_furamaresort.model.contract.ContractDetail;
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


@Controller
@RequestMapping(value = "/contractDetail")
public class ContractDetailController {
    @Autowired
    private IAttachFacilityService iAttachFacilityService;
    @Autowired
    private IContractDetailService iContractDetailService;


    // gọi đến trang list để list và contractDetairestful làm viecj với nhau
    @GetMapping("")
    public String showContractDetail(Model model) {
        return "contract_detail_list/list";
    }












//    @GetMapping(value = "")
//    public String showListContract(Model model,
//                                   @PageableDefault(value = 4) Pageable pageable){
//        Page<ContractDetail> contractDetailList = this.iContractDetailService.findAllContractDetail(pageable);
//        model.addAttribute("contractDetailList",contractDetailList);
//        return "contract_detail_list";
//    }



}
