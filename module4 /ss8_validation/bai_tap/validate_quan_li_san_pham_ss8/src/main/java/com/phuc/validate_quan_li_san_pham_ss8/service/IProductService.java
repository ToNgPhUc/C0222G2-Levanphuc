package com.phuc.validate_quan_li_san_pham_ss8.service;

import com.phuc.validate_quan_li_san_pham_ss8.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IProductService {

    Page<Product> findByName(String searchType, Pageable pageable);

    void save(Product product);

    List<Product> findAll();

    Product findByIdProduct(int idProduct);

    void deleteById(Integer idProduct);
}
