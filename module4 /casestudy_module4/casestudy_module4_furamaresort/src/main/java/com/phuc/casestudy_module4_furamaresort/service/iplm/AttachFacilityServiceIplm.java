package com.phuc.casestudy_module4_furamaresort.service.iplm;

import com.phuc.casestudy_module4_furamaresort.model.contract.AttachFacility;
import com.phuc.casestudy_module4_furamaresort.repository.IAttachFacilityRepository;
import com.phuc.casestudy_module4_furamaresort.service.IAttachFacilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttachFacilityServiceIplm implements IAttachFacilityService {
    @Autowired
    private IAttachFacilityRepository iAttachFacilityRepository;

    @Override
    public List<AttachFacility> findAll() {
        return iAttachFacilityRepository.findAll();
    }

    @Override
    public Page<AttachFacility> findByName(String keywordVal, Pageable pageable) {
        return iAttachFacilityRepository.findByName(keywordVal,pageable);
    }
}
