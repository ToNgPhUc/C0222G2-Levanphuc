package com.phuc.quan_li_dien_thoai.service;


import com.phuc.quan_li_dien_thoai.model.Smartphone;
import com.phuc.quan_li_dien_thoai.repository.ISmartphoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SmartphoneService implements ISmartphoneService {
    @Autowired
    private ISmartphoneRepository smartPhoneRepository;


    @Override
    public Optional<Smartphone> findById(Long id) {
        return smartPhoneRepository.findById(id);
    }

    @Override
    public Smartphone save(Smartphone smartPhone) {
        return smartPhoneRepository.save(smartPhone);
    }

    @Override
    public void remove(Long id) {
        smartPhoneRepository.deleteById(id);
    }

    @Override
    public Page<Smartphone> findAllByName(String keywordVar, Pageable pageable) {
        return smartPhoneRepository.findAllByName("%" + keywordVar + "%",pageable);
    }


}
