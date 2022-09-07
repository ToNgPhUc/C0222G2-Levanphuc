package com.example.demo.service.sanPham;

import com.example.demo.model.LoaiSanPham;
import com.example.demo.repository.ILoaiSanPhamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoaiSanPhamService implements ILoaiSanPhamService{
    @Autowired
    private ILoaiSanPhamRepository iLoaiSanPhamRepository;

    @Override
    public List<LoaiSanPham> getAllLoaiSanPham() {
        return this.iLoaiSanPhamRepository.findAll();
    }
}
