package com.phuc.ss10_them_sp_vao_gio_hang_list.service;



import com.phuc.ss10_them_sp_vao_gio_hang_list.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();

    void save(Product product);

    Product getById(int id);
}