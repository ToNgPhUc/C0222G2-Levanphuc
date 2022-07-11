package com.phuc.casestudy_module4_furamaresort.controller;

import com.phuc.casestudy_module4_furamaresort.model.contract.Contract;
import com.phuc.casestudy_module4_furamaresort.model.contract.ContractDetail;
import com.phuc.casestudy_module4_furamaresort.model.contract.ContractDto;
import com.phuc.casestudy_module4_furamaresort.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping(value = "contract")

public class ContractController {
    @Autowired
    private IContractService iContractService;
    @Autowired
    private IContractDetailService iContractDetailService;
    @Autowired
    private IAttachFacilityService iAttachFacilityService;
    @Autowired
    private IFacilityService iFacilityService;
    @Autowired
    private ICustomerService iCustomerService;

    @GetMapping(value = "")
    public String showListContract(Model model,
                                   @PageableDefault(value = 4) Pageable pageable,
                                   @RequestParam Optional<String> keyword) {
        String keywordVal = keyword.orElse("");
        Page<ContractDto> contractDtoPage = this.iContractService.getAllContract(keywordVal, pageable);
        model.addAttribute("contractList", contractDtoPage);
        model.addAttribute("keywordVal", keywordVal);

//        thêm mới hợp đồng chi tiết
        model.addAttribute("contractDetailList",this.iContractDetailService.findAll());
        model.addAttribute("contractDetail", new ContractDetail());
        return "contract_list";
    }
    @PostMapping(value = "saveContractDetail")
    public String createContractDetail(@ModelAttribute ContractDetail contractDetail){
        this.iContractDetailService.save(contractDetail);
        return "redirect:/contract";
    }

    @GetMapping(value = "create")
    public String showFormCreate(Model model) {
        model.addAttribute("contractDetailList", this.iContractDetailService.findAll());
        model.addAttribute("attachFacilityList", this.iAttachFacilityService.findAll());
        model.addAttribute("facilityList", iFacilityService.findAll());
        model.addAttribute("customerList", iCustomerService.findAll());


        model.addAttribute("contract", new Contract());
        return "contract_create";
    }

    @PostMapping(value = "save")
    public String saveCustomer(@ModelAttribute Contract contract) {
        iContractService.save(contract);
        return "redirect:/contract";
    }

}
