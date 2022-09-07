package com.phuc.baithimodule5.repository;


import com.phuc.baithimodule5.model.LoHang;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ILoHangRepository extends JpaRepository<LoHang, Integer> {

//    @Query(value = "select *from lo_hang where ma_lo_hang like :searchName", nativeQuery = true,
//            countQuery = "select count(*)from (select *from lo_hang where ma_lo_hang like :searchName)temp_table")
//    Page<LoHang> getAllByName(@Param("searchName")String searchName, Pageable pageable);
}
