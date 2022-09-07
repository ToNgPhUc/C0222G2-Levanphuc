package com.phuc.quan_li_kho_hang.service;

import com.phuc.quan_li_kho_hang.model.SanPham;
import com.phuc.quan_li_kho_hang.repository.ISanPhamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SanPhamService implements ISanPhamService {
    @Autowired
    private ISanPhamRepository iSanPhamRepository;
    @Override
    public List<SanPham> getAllSanPham() {
        return iSanPhamRepository.findAll();
    }
}
