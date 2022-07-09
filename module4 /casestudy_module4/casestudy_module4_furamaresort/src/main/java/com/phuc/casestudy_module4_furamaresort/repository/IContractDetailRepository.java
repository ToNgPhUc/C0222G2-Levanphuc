package com.phuc.casestudy_module4_furamaresort.repository;

import com.phuc.casestudy_module4_furamaresort.model.contract.ContractDetail;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface IContractDetailRepository extends JpaRepository<ContractDetail,Integer> {
    @Query(value = "select * from contract_detail where contract_detai.id = :id",nativeQuery = true,
            countQuery = "select  count(*) from (select  * from  contract_detail where contract_detai.id = :id)temp_table")
    Page<ContractDetail> findByIdContractDetail(@Param("id") int id, Pageable pageable);


}
