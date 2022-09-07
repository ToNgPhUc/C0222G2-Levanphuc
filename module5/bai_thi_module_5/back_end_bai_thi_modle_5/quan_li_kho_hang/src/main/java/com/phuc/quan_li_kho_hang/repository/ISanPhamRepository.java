package com.phuc.quan_li_kho_hang.repository;

import com.phuc.quan_li_kho_hang.model.SanPham;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISanPhamRepository extends JpaRepository<SanPham, Integer> {
}
