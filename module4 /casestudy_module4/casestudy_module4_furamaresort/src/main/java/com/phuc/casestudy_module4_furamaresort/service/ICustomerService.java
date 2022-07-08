package com.phuc.casestudy_module4_furamaresort.service;

import com.phuc.casestudy_module4_furamaresort.model.customer.Customer;
import com.phuc.casestudy_module4_furamaresort.model.dto.CustomerDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ICustomerService {

    Page<Customer> findAllByName(String keywordVal, Pageable pageable);

    void delete(Integer id);

    void save(Customer customer);

    Customer findByIdCustomer(int id);
}
