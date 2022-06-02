package service.iplm;

import model.Product;
import repository.IProductRepository;
import repository.iplm.ProductRepositoryIplm;
import service.IProductService;

import java.util.List;

public class ProductServiceIplm implements IProductService {
    IProductRepository productRepository= new ProductRepositoryIplm();

    @Override
    public List<Product> getAllProduct() {
        return productRepository.getAllProduct();
    }

    @Override
    public void save(Product product) {
      productRepository.save(product);
    }

    @Override
    public void edit(Integer id, Product product) {
      productRepository.edit(id,product);
    }

    @Override
    public Product findById(Integer id) {
        return productRepository.findById(id);
    }
}
