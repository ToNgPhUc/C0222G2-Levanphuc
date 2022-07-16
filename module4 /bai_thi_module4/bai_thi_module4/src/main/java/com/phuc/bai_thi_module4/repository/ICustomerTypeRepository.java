package com.phuc.bai_thi_module4.repository;

import com.phuc.bai_thi_module4.model.CustomerType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICustomerTypeRepository extends JpaRepository<CustomerType,Integer> {
}
