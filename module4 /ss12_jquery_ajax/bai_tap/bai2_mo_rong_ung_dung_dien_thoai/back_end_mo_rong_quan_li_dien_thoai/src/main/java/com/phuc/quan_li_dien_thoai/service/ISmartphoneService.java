package com.phuc.quan_li_dien_thoai.service;

import com.phuc.quan_li_dien_thoai.model.Smartphone;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface ISmartphoneService {


    Optional<Smartphone> findById(Long id);

    Smartphone save(Smartphone smartPhone);

    void remove(Long id);

    Page<Smartphone> findAllByName(String keywordVar, Pageable pageable);
}
