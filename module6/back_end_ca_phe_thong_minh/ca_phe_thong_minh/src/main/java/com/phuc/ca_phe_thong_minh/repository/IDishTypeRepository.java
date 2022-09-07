package com.phuc.ca_phe_thong_minh.repository;

import com.phuc.ca_phe_thong_minh.model.DishType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IDishTypeRepository extends JpaRepository<DishType, Integer> {

}
