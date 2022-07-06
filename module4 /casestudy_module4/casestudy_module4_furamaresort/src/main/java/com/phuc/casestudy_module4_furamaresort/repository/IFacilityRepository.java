package com.phuc.casestudy_module4_furamaresort.repository;

import com.phuc.casestudy_module4_furamaresort.model.facility.Facility;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IFacilityRepository extends JpaRepository<Facility,Integer> {
    @Query(value = "select *from facility where name_facility like  :keywordVal ",nativeQuery = true,
            countQuery = " select count(*) from (select * from facility where name_facility like :keywordVal) temp_table ")
    Page<Facility> findAllByName(@Param("keywordVal") String keywordVal,Pageable pageable );

}
