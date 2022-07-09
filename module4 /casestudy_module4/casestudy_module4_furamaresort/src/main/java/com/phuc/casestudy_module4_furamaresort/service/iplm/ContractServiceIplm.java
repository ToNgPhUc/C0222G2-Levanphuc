package com.phuc.casestudy_module4_furamaresort.service.iplm;

import com.phuc.casestudy_module4_furamaresort.model.contract.Contract;
import com.phuc.casestudy_module4_furamaresort.model.contract.ContractDetail;
import com.phuc.casestudy_module4_furamaresort.repository.IContractRepository;
import com.phuc.casestudy_module4_furamaresort.service.IContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ContractServiceIplm implements IContractService {
    @Autowired
    private IContractRepository iContractRepository;

    @Override
    public Page<Contract> findByName(String keywordVal, Pageable pageable) {

        return iContractRepository.findByName("%" + keywordVal + "%", pageable);
    }

    public int getTotal(String keywordVal, Pageable pageable){
        int total = 0;
        for (Contract contract : iContractRepository.findByName("%" + keywordVal + "%", pageable).getContent()) {
            for (ContractDetail contractDetail : contract.getContractDetailList()) {
                total = (int) (contractDetail.getQuantity()*contractDetail.getAttachFacility().getCode());
            }
        }return total;
    }

    @Override
    public Contract findAll() {
        return null;
    }

    @Override
    public void save(Contract contract) {
        iContractRepository.save(contract);
    }

}
