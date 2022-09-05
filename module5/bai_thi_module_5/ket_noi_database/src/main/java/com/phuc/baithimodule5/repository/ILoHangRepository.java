package com.phuc.demo.repository;

import com.phuc.demo.model.LoHang;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ILoHangRepository extends JpaRepository<LoHang,Integer> {
//    @Query(value = "select *from lo_hang where ten_san_pham like :keywordVal",nativeQuery = true,
//            countQuery = "select count(*)from (select *from lo-hang where ten_san_pham like :keywordVal)temp_table")
//    Page<LoHang> findAllByName(String keywordVal, Pageable pageable);
}
