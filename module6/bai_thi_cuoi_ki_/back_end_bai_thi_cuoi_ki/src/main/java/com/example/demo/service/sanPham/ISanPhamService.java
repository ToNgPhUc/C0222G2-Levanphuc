package com.example.demo.service.sanPham;


import com.example.demo.model.SanPham;

import java.util.List;
import java.util.Optional;

public interface ISanPhamService  {


    List<SanPham> getAll();

    Optional<SanPham> findById(int id);

    void remove(int id);

    SanPham save(SanPham sanPham);
}
