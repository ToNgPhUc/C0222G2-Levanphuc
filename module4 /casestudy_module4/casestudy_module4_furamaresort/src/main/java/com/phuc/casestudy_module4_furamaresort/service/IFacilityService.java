package com.phuc.casestudy_module4_furamaresort.service;

import com.phuc.casestudy_module4_furamaresort.model.facility.Facility;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IFacilityService {
    Page<Facility> findAllByName(String keywordVal,Pageable pageable);

    List<Facility> findAll();

    void save(Facility facility);


    Facility findByIdFacility(int id);

    void delete(Integer id);
}
