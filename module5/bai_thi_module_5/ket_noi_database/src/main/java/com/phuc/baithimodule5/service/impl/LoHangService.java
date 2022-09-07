package com.phuc.baithimodule5.service.impl;


import com.phuc.baithimodule5.model.LoHang;
import com.phuc.baithimodule5.repository.ILoHangRepository;
import com.phuc.baithimodule5.service.ILoHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class LoHangService implements ILoHangService {
    @Autowired
    private ILoHangRepository iLoHangRepository;

    @Override
    public List<LoHang> getAllLoHang() {
        return iLoHangRepository.findAll();
    }

    @Override
    public LoHang save(LoHang loHang) {
        return iLoHangRepository.save(loHang);
    }

//
//    @Override
//    public Page<LoHang> findAllByName(String searchName, Pageable pageable) {
//        return iLoHangRepository.getAllByName("%"+searchName+"%",pageable);
//    }
}
