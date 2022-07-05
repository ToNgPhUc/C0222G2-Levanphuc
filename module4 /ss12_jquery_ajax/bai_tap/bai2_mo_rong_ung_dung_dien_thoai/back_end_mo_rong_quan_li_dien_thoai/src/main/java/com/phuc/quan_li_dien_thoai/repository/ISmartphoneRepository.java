package com.phuc.quan_li_dien_thoai.repository;

import com.phuc.quan_li_dien_thoai.model.Smartphone;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ISmartphoneRepository extends CrudRepository<Smartphone, Long> {
    @Query(value = " select * from smartphones where producer like :keywordVar ", nativeQuery = true,
            countQuery = " select count(*) from (select * from smartphones where producer like :keywordVar) temp_table ")
    Page<Smartphone> findAllByName(@Param("keywordVar") String keywordVar, Pageable pageable);

    @Query(value = "select * from smartphones where id = :id", nativeQuery = true)
    Optional<Smartphone> findByIdBSmartphone(@Param("id") long id);
}