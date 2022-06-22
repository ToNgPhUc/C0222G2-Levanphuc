package com.phuc.service.iplm;

import com.phuc.repository.ICustomerRepository;
import com.phuc.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerServiceIplm implements ICustomerService {
    @Autowired
    private ICustomerRepository icustomerRepository;

    @Override
    public List findAll() {
        return icustomerRepository.findAll();
    }

    @Override
    public Object findById(Long id) {
        return null;
    }

    @Override
    public void save(Object o) {

    }

    @Override
    public void remove(Long id) {

    }
}
