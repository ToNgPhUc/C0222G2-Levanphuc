package com.phuc.service;

import com.phuc.model.Product;

import java.util.List;

public interface IProductService {

    Product findById(int idProduct);

    List<Product> finAll();

    void save(Product product);

    void edit(Integer idProduct, Product product);

    void delete(Integer idProduct);

    List<Product> searchByName(String nameProduct);
}
