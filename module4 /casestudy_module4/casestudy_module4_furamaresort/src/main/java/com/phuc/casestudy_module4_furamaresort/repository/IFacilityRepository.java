package com.phuc.casestudy_module4_furamaresort.repository;

import com.phuc.casestudy_module4_furamaresort.model.Facility;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IFacilityRepository extends JpaRepository<Facility,Integer> {
    @Query(value = "select *from facility where name_facility like  :keywordVal ",nativeQuery = true)
    Page<Facility> findAllByName(@Param("keywordVal") Pageable pageable, String keywordVal);
}
