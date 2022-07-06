package com.phuc.casestudy_module4_furamaresort.service.iplm;

import com.phuc.casestudy_module4_furamaresort.model.FacilityType;
import com.phuc.casestudy_module4_furamaresort.repository.IFacilityRepository;
import com.phuc.casestudy_module4_furamaresort.repository.IFacilityTypeRepository;
import com.phuc.casestudy_module4_furamaresort.service.IFacilityTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacilityTypeServiceIplm implements IFacilityTypeService {
    @Autowired
    private IFacilityTypeRepository iFacilityTypeRepository;

    @Override
    public List<FacilityType> findAll() {
        return iFacilityTypeRepository.findAll();
    }
}
