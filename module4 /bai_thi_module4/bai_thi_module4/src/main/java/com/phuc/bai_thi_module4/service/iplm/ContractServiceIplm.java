package com.phuc.bai_thi_module4.service.iplm;

import com.phuc.bai_thi_module4.model.Contract;

import com.phuc.bai_thi_module4.repository.IContractRepository;
import com.phuc.bai_thi_module4.service.IContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


@Service
public class ContractServiceIplm implements IContractService {
    @Autowired
    private IContractRepository iContractRepository;

    public Page<Contract> findAllByName(String keywordVal, Pageable pageable) {
        return iContractRepository.findAllByName("%" + keywordVal + "%", pageable);
    }

    @Override
    public void save(Contract contract) {
        iContractRepository.save(contract);
    }

    @Override
    public void delete(int id) {
iContractRepository.delete(iContractRepository.getById(id));
    }




}
