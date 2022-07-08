package com.phuc.casestudy_module4_furamaresort.service;

import com.phuc.casestudy_module4_furamaresort.model.customer.CustomerType;

import java.util.List;

public interface ICustomerTypeService {
    List<CustomerType> findAll();
}
