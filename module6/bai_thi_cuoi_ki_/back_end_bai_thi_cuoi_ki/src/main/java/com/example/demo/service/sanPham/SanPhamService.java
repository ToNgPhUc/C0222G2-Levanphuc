package com.example.demo.service.sanPham;

import com.example.demo.model.SanPham;
import com.example.demo.repository.ISanPhamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SanPhamService implements ISanPhamService{
    @Autowired
    private ISanPhamRepository iSanPhamRepository;


    @Override
    public List<SanPham> getAll() {
        return this.iSanPhamRepository.findAll();
    }

    @Override
    public Optional<SanPham> findById(int id) {
        return this.iSanPhamRepository.findById(id);
    }

    @Override
    public void remove(int id) {
        this.iSanPhamRepository.deleteById(id);
    }

    @Override
    public SanPham save(SanPham sanPham) {
        return this.iSanPhamRepository.save(sanPham);
    }
}
