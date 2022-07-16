package com.phuc.bai_thi_module4.service;

import com.phuc.bai_thi_module4.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ICustomerService {

    Page<Customer> findAllByName(String keywordVal, Pageable pageable);

    void delete(Integer id);

    void save(Customer customer);

    Customer findByIdCustomer(int id);

}