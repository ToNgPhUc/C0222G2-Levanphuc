package com.phuc.repository;

import com.phuc.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> findAll();

    void save(Product product);

    Product findById(int idProduct);

    void edit(Product product);
}
