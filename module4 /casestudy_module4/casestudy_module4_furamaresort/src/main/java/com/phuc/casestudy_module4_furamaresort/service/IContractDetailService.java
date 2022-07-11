package com.phuc.casestudy_module4_furamaresort.service;

import com.phuc.casestudy_module4_furamaresort.model.contract.ContractDetail;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IContractDetailService {

     List<ContractDetail> findAll();

    Page<ContractDetail> findAllContractDetail(Pageable pageable);

    ContractDetail save(ContractDetail contractDetail);
}
