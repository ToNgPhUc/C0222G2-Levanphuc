package com.phuc.casestudy_module4_furamaresort.service;

import com.phuc.casestudy_module4_furamaresort.model.contract.AttachFacility;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IAttachFacilityService {
 List<AttachFacility> findAll();

    Page<AttachFacility> findByName(String keywordVal, Pageable pageable);
}
