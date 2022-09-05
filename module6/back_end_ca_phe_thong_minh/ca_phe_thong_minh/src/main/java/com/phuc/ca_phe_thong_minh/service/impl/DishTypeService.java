package com.phuc.ca_phe_thong_minh.service;

import com.phuc.ca_phe_thong_minh.model.DishType;
import com.phuc.ca_phe_thong_minh.repository.IDishTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DishTypeService implements IDishTypeService{
    @Autowired
    private IDishTypeRepository iDishTypeRepository;

    @Override
    public List<DishType> getAllDishType() {
        return iDishTypeRepository.findAll();
    }
}
