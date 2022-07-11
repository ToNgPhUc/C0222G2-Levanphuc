package com.phuc.casestudy_module4_furamaresort.repository;

import com.phuc.casestudy_module4_furamaresort.model.customer.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ICustomerRepository extends JpaRepository<Customer, Integer> {
    @Query(value = "select *from customer where name_customer like :keywordVal",nativeQuery = true,
    countQuery = "select count(*)from (select *from customer where name_customer like :keywordVal)temp_table")
    Page<Customer> findAllByName(@Param("keywordVal") String keywordVal, Pageable pageable);

    @Query(value = "select  * from  customer where id = :id",nativeQuery = true)
    Customer getByIdCustomer(@Param("id") int id);


    @Query(value = "select customer.* from customer join contract c on customer.id = c.customer " +
            " join contract_detail cd on c.id = cd.contract " +
            " join attach_facility af on af.id = cd.attach_facility " +
            " join facility f on c.facility = f.id where name_customer like :keywordVal " +
            " group by customer.id ",nativeQuery = true,
    countQuery = " select count(*) from (select customer.* from customer join contract c on customer.id = c.customer " +
            " join contract_detail cd on c.id = cd.contract " +
            " join attach_facility af on af.id = cd.attach_facility " +
            " join facility f on c.facility = f.id  where name_customer like :keywordVal " +
            " group by customer.id ) temp_table ")
    Page<Customer> findByNameCustomerUserFacility(@Param("keywordVal") String keywordVal, Pageable pageable);
}
