package com.phuc.bai_thi_module4.repository;

import com.phuc.bai_thi_module4.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ICustomerRepository extends JpaRepository<Customer, Integer> {
    @Query(value = "select *from customer where name_customer like :keywordVal",nativeQuery = true,
            countQuery = "select count(*)from (select *from customer where name_customer like :keywordVal)temp_table")
    Page<Customer> findAllByName(@Param("keywordVal") String keywordVal, Pageable pageable);

}
