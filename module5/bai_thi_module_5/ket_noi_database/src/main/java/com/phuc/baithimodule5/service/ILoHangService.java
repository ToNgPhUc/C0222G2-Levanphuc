package com.phuc.baithimodule5.service;


import com.phuc.baithimodule5.model.LoHang;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ILoHangService {


//    Page<LoHang> findAllByName(String searchName, Pageable pageable);

    List<LoHang> getAllLoHang();

    LoHang save(LoHang loHang);
}
