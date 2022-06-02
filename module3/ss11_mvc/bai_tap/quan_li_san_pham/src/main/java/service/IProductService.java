package service;

import model.Product;

import java.util.List;

public interface IProductService {
    List<Product> getAllProduct();
    void save(Product product);
    void edit(Integer id,Product product);

    Product findById(Integer id);
}
