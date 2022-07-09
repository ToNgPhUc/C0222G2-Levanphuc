package com.phuc.casestudy_module4_furamaresort.repository;

import com.phuc.casestudy_module4_furamaresort.model.contract.AttachFacility;
import com.phuc.casestudy_module4_furamaresort.model.contract.Contract;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IAttachFacilityRepository extends JpaRepository<AttachFacility,Integer> {
    @Query(value = "select * from attach_facility where name_attach like:keywordVal",nativeQuery = true,
            countQuery = "select  count(*) from (select  * from  attach_facility where name_attach like :keywordVal)temp_table")
    Page<AttachFacility> findByName(@Param("keywordVal") String keywordVal, Pageable pageable);
}
