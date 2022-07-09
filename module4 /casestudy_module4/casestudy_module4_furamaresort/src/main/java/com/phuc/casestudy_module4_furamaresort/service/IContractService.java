package com.phuc.casestudy_module4_furamaresort.service;

import com.phuc.casestudy_module4_furamaresort.model.contract.Contract;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IContractService {
    Page<Contract> findByName(String keywordVal, Pageable pageable);


    int getTotal(String keywordVal, Pageable pageable);

    Contract findAll();

    void save(Contract contract);
}
