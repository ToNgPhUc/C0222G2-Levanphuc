package com.phuc.casestudy_module4_furamaresort.controller;

import com.phuc.casestudy_module4_furamaresort.model.contract.ContractDetail;
import com.phuc.casestudy_module4_furamaresort.service.IContractDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/contract_detail_restful")
@CrossOrigin
public class ContractDetailRestfulController {
    @Autowired
    private IContractDetailService iContractDetailService;
        @GetMapping(value = "")
    public ResponseEntity<Page<ContractDetail>> findAllPageBlog(@PageableDefault(value = 2) Pageable pageable){
        Page<ContractDetail> contractDetailList = iContractDetailService.findAllContractDetail(pageable);
        if (!contractDetailList.hasContent()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }return new ResponseEntity<>(contractDetailList,HttpStatus.OK);
    }

    @PostMapping(value = "create")
    public ResponseEntity<ContractDetail> saveContractDetail(@RequestBody ContractDetail contractDetail) {
        return new ResponseEntity<>(iContractDetailService.save(contractDetail), HttpStatus.CREATED);
    }
}
