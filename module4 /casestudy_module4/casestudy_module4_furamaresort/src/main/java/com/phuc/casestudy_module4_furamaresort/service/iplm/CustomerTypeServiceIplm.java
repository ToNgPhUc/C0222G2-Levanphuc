package com.phuc.casestudy_module4_furamaresort.service.iplm;

import com.phuc.casestudy_module4_furamaresort.model.customer.CustomerType;
import com.phuc.casestudy_module4_furamaresort.repository.ICustomerTypeRepository;
import com.phuc.casestudy_module4_furamaresort.service.ICustomerTypeService;
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
