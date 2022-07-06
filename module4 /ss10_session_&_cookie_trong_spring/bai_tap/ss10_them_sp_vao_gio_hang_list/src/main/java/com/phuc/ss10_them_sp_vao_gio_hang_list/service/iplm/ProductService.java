package com.phuc.ss10_them_sp_vao_gio_hang_list.service.iplm;


import com.phuc.ss10_them_sp_vao_gio_hang_list.model.Product;
import com.phuc.ss10_them_sp_vao_gio_hang_list.repository.IProductRepository;
import com.phuc.ss10_them_sp_vao_gio_hang_list.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductService implements IProductService {
    @Autowired
    private IProductRepository productRepository;

    @Override
    public List<Product> findAll() {
        return this.productRepository.findAll();
    }

    @Override
    public void save(Product product) {
        this.productRepository.save(product);
    }

    @Override
    public Product getById(int id) {
        return this.productRepository.getById(id);
    }
}
