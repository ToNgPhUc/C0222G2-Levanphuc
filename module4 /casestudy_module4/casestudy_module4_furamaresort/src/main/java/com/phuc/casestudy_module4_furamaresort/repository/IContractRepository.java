package com.phuc.casestudy_module4_furamaresort.repository;

import com.phuc.casestudy_module4_furamaresort.model.contract.Contract;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;



public interface IContractRepository extends JpaRepository<Contract, Integer> {
    @Query(value = "select * from contract where deposit like:keywordVal", nativeQuery = true,
            countQuery = "select  count(*) from (select  * from  contract where deposit like :keywordVal)temp_table")
    Page<Contract> findByName(@Param("keywordVal") String keywordVal, Pageable pageable);

//    @Query(value = "select * from contract join contract_detail on table contract.id = contract_detail.contract join attach_facility on table contract_detail.attach_facility = attach_facility.id  " +
//            " where start_date like:keywordVal",nativeQuery = true,
//    countQuery = "select  count(*) from (select * from contract join contract_detail on table contract.id = contract_detail.contract join attach_facility on table contract_detail.attach_facility = attach_facility.id  \" +\n" +
//            "            \" where start_date like:keywordVal)temp_table")
//    Page<Contract> findByName(@Param("keywordVal") String keywordVal, Pageable pageable);

}
