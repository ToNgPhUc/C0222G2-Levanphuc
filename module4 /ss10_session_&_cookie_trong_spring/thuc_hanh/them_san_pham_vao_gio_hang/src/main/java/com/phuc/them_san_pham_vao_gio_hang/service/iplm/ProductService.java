package com.phuc.them_san_pham_vao_gio_hang.service.iplm;

import com.phuc.them_san_pham_vao_gio_hang.model.Product;
import com.phuc.them_san_pham_vao_gio_hang.repository.IProductRepository;
import com.phuc.them_san_pham_vao_gio_hang.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService implements IProductService {
    @Autowired
    private IProductRepository productRepository;

    @Override
    public Iterable<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Optional<Product> findById(Long id) {
        return productRepository.findById(id);
    }

    @Override
    public Product findByIdProduct(long id) {
        return productRepository.findByIdProduct(id);
    }
}
