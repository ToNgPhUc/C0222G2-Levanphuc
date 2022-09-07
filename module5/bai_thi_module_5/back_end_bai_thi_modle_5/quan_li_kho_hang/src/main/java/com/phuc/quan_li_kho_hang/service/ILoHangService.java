package com.phuc.quan_li_kho_hang.service;

import com.phuc.quan_li_kho_hang.model.LoHang;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface ILoHangService {

    List<LoHang> getAllLoHang();

    LoHang save(LoHang loHang);

    Optional<LoHang> findById(int id);

    void remove(int id);

    Page<LoHang> findAll(Pageable pageable);

    Page<LoHang> findAllByName(String searchName,String ngayNhapHangSearch, Pageable pageable);
}
