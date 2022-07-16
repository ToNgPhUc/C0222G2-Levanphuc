package com.phuc.bai_thi_module4.service.iplm;

import com.phuc.bai_thi_module4.model.CustomerType;
import com.phuc.bai_thi_module4.repository.ICustomerTypeRepository;
import com.phuc.bai_thi_module4.service.ICustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerTypeServiceIplm implements ICustomerTypeService {
    @Autowired
    private ICustomerTypeRepository iCustomerTypeRepository;

    @Override
    public List<CustomerType> findAll() {
        return iCustomerTypeRepository.findAll();
    }
}
