package com.phuc.casestudy_module4_furamaresort.service.iplm;

import com.phuc.casestudy_module4_furamaresort.model.customer.Customer;
import com.phuc.casestudy_module4_furamaresort.repository.ICustomerRepository;
import com.phuc.casestudy_module4_furamaresort.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceIplm implements ICustomerService {
    @Autowired
    private ICustomerRepository iCustomerRepository;

    @Override
    public Page<Customer> findAllByName(String keywordVal, Pageable pageable) {
        return iCustomerRepository.findAllByName("%"+keywordVal+"%",pageable);
    }

    @Override
    public void delete(Integer id) {
        iCustomerRepository.delete(iCustomerRepository.getById(id));
    }
}
