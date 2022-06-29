package com.phuc.ss9_ung_dung_muon_sach.repository;

import com.phuc.ss9_ung_dung_muon_sach.model.DetailsBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IDetailsBookRepository extends JpaRepository<DetailsBook,Integer> {
    @Query(value = "select * from details_book where id_details = :idDetails",nativeQuery = true)
    DetailsBook findByIdDetailsBook(@Param("idDetails") int idDetails);

}
