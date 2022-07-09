package com.phuc.casestudy_module4_furamaresort.service.iplm;

import com.phuc.casestudy_module4_furamaresort.model.contract.ContractDetail;
import com.phuc.casestudy_module4_furamaresort.repository.IContractDetailRepository;
import com.phuc.casestudy_module4_furamaresort.service.IContractDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContractDetailServiceIplm implements IContractDetailService {
    @Autowired
    private IContractDetailRepository iContractDetailRepository;


    @Override
    public List<ContractDetail> findAll() {
        return iContractDetailRepository.findAll();
    }

    @Override
    public Page<ContractDetail> findById(int id, Pageable pageable) {
        return iContractDetailRepository.findByIdContractDetail(id,pageable);
    }


}
