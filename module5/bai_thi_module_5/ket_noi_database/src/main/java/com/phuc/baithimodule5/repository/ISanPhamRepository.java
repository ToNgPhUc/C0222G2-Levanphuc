package com.phuc.baithimodule5.repository;

import com.phuc.baithimodule5.model.SanPham;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISanPhamRepository extends JpaRepository<SanPham, Integer> {
}
