package com.phuc.validate_quan_li_san_pham_ss8.service.iplm;

import com.phuc.validate_quan_li_san_pham_ss8.model.Product;
import com.phuc.validate_quan_li_san_pham_ss8.repository.IProductRepository;
import com.phuc.validate_quan_li_san_pham_ss8.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductServiceIplm implements IProductService {
    @Autowired
    private IProductRepository iProductRepository;

    @Override
    public Page<Product> findByName(String searchType, Pageable pageable) {
        return iProductRepository.findByName("%" + searchType + "%", pageable);
    }

    @Override
    public void save(Product product) {
        this.iProductRepository.save(product);
    }

    @Override
    public List<Product> findAll() {
        return this.iProductRepository.findAll();
    }

    @Override
    public Product findByIdProduct(int idProduct) {
        return iProductRepository.findByIdProduct(idProduct);
    }

    @Override
    public void deleteById(Integer idProduct) {
        iProductRepository.deleteById(idProduct);
    }
}
