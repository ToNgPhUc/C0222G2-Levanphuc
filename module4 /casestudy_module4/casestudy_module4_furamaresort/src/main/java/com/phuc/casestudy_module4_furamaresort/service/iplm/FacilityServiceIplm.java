package com.phuc.casestudy_module4_furamaresort.service.iplm;

import com.phuc.casestudy_module4_furamaresort.model.facility.Facility;
import com.phuc.casestudy_module4_furamaresort.repository.IFacilityRepository;
import com.phuc.casestudy_module4_furamaresort.service.IFacilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacilityServiceIplm implements IFacilityService {
    @Autowired
    private IFacilityRepository iFacilityRepository;

    @Override
    public Page<Facility> findAllByName(String keywordVal, Pageable pageable) {
        return iFacilityRepository.findAllByName("%"+ keywordVal +"%" ,pageable);
    }

    @Override
    public List<Facility> findAll() {
        return iFacilityRepository.findAll();
    }

    @Override
    public void save(Facility facility) {
        this.iFacilityRepository.save(facility);
    }

    @Override
    public Facility findByIdFacility(int id) {
        return this.iFacilityRepository.getById(id);
    }

    @Override
    public void delete(Integer id) {
        this.iFacilityRepository.delete(iFacilityRepository.getById(id));
    }


}
