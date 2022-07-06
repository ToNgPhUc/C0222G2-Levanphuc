package com.phuc.casestudy_module4_furamaresort.service;

import com.phuc.casestudy_module4_furamaresort.model.Facility;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IFacilityService {
    Page<Facility> findAllByName(Pageable pageable, String keywordVal);

    List<Facility> findAll();

    void save(Facility facility);
}
