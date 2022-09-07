package com.phuc.baithimodule5.service.impl;

import com.phuc.baithimodule5.model.LoHang;
import com.phuc.baithimodule5.model.SanPham;
import com.phuc.baithimodule5.repository.ILoHangRepository;
import com.phuc.baithimodule5.repository.ISanPhamRepository;
import com.phuc.baithimodule5.service.ISanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SanPhamService implements ISanPhamService {
    @Autowired
    private ISanPhamRepository iSanPhamRepository;

    @Override
    public List<SanPham> getAllSanPham() {
        return this.iSanPhamRepository.findAll();
    }
}
