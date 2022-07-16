package com.phuc.bai_thi_module4.controller;

import com.phuc.bai_thi_module4.dto.ContractDto;
import com.phuc.bai_thi_module4.dto.CustomerDto;
import com.phuc.bai_thi_module4.model.Contract;
import com.phuc.bai_thi_module4.model.Customer;
import com.phuc.bai_thi_module4.service.IContractService;
import com.phuc.bai_thi_module4.service.IRoomService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@Controller
@RequestMapping(value = "contract")
public class ContractController {
    @Autowired
    private IContractService iContractService;
    @Autowired
    private IRoomService iRoomService;
    @GetMapping(value = "")
    public String showListCustomer(Model model,
                                   @PageableDefault(value = 3) Pageable pageable,
                                   @RequestParam Optional<String> keyword) {
        String keywordVal = keyword.orElse("");
        Page<Contract> contractList = this.iContractService.findAllByName(keywordVal, pageable);
        model.addAttribute("contractList", contractList);
        model.addAttribute("keywordVal", keywordVal);
        return "contract_list";
    }
    @GetMapping(value = "create")
    public String showFormCreate( Model model){
        model.addAttribute("roomList",this.iRoomService.findAll());
        model.addAttribute("contract",new ContractDto());
        return "contract_create";
    }

    @PostMapping(value = "save")
    public String saveCustomer(@Valid @ModelAttribute ContractDto contractDto, BindingResult bindingResult,
                               Model model){
        if (bindingResult.hasErrors()){
            model.addAttribute("roomList",this.iRoomService.findAll());
            return "contract_create";
        }
        Contract contract= new Contract();
        BeanUtils.copyProperties(contractDto, contract);
        iContractService.save(contract);
        return "redirect:/contract";
    }
    @GetMapping(value = "/{id}/delete")
    String delete (@PathVariable int id){
        iContractService.delete(id);
        return "redirect:/contract";
    }


}
