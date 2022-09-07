package com.phuc.quan_li_kho_hang.repository;

import com.phuc.quan_li_kho_hang.model.LoHang;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IloHangRepository extends JpaRepository<LoHang, Integer> {
    @Query(value = " select lo_hang.* from lo_hang join san_pham sp on sp.id = lo_hang.san_pham " +
            " where ten_san_pham like :searchName and ngay_nhap_hang like :ngayNhapHangSearch ", nativeQuery = true,
            countQuery = "select lo_hang.* from lo_hang join san_pham sp on sp.id = lo_hang.san_pham and ngay_nhap_hang like :ngayNhapHangSearch" +
                    "  where ten_san_pham like :searchName")
    Page<LoHang> findAllByName(@Param("searchName") String searchName, @Param("ngayNhapHangSearch") String ngayNhapHangSearch, Pageable pageable);
}
