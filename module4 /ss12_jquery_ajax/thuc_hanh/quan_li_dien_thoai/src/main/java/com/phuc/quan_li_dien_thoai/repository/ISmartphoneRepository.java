package com.phuc.quan_li_dien_thoai.repository;

import com.phuc.quan_li_dien_thoai.model.Smartphone;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISmartphoneRepository extends CrudRepository<Smartphone, Long> {
}