package com.phuc.casestudy_module4_furamaresort.service.iplm;

import com.phuc.casestudy_module4_furamaresort.model.contract.Contract;
import com.phuc.casestudy_module4_furamaresort.model.contract.ContractDetail;
import com.phuc.casestudy_module4_furamaresort.model.contract.ContractDto;
import com.phuc.casestudy_module4_furamaresort.repository.IContractRepository;
import com.phuc.casestudy_module4_furamaresort.service.IContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class ContractServiceIplm implements IContractService {
    @Autowired
    private IContractRepository iContractRepository;



    @Override
    public Contract findAll() {
        return null;
    }


    @Override
    public void save(Contract contract) {
        iContractRepository.save(contract);
    }

    @Override
    public Page<ContractDto> getAllContract(String keywordVal, Pageable pageable) {
        Page<Contract> contractPage = this.iContractRepository.findByName("%"+ keywordVal +"%", pageable);
        List<ContractDto> contractDtoList = new ArrayList<>();
        Page<ContractDto> contractDtoPage = new PageImpl<>(contractDtoList);
        for (int i = 0; i < contractPage.getContent().size(); i++) {
            int total = 0;
            for (ContractDetail contractDetail: contractPage.getContent().get(i).getContractDetailList()) {
                total += contractDetail.getQuantity() * contractDetail.getAttachFacility().getCode();
            }
            ContractDto contractDto = new ContractDto(contractPage.getContent().get(i).getId(),
                    contractPage.getContent().get(i).getStartDate(),
                    contractPage.getContent().get(i).getEndDate(),
                    contractPage.getContent().get(i).getDeposit(),
                    contractPage.getContent().get(i).getCustomer(),
                    contractPage.getContent().get(i).getEmployee(),
                    contractPage.getContent().get(i).getFacility(),
                    contractPage.getContent().get(i).getContractDetailList(),
                    total);
            contractDtoList.add(contractDto);
        }
        contractDtoPage = new PageImpl<>(contractDtoList);
        return contractDtoPage;
    }
}
