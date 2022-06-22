package com.phuc.service;

import com.phuc.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> finAll();

    void save(Product product);

    Product findById(int idProduct);

    void edit(Product music);

    void delete(Integer idProduct);
}
