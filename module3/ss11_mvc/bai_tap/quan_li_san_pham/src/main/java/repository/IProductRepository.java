package repository;

import model.Product;

import java.util.List;

public interface IProductRepository {
List<Product> getAllProduct();
void save(Product product);
void edit(Integer id,Product product);
    Product findById(Integer id);
}
