package phuc.com.shoponline.service.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import phuc.com.shoponline.model.product.Product;
import phuc.com.shoponline.repository.product.IProductRepository;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService implements IproductService {
    @Autowired
    private IProductRepository iProductRepository;



    @Override
    public void save(Product product) {
        this.iProductRepository.save(product);
    }

    @Override
    public List<Product> findAll() {
        return this.iProductRepository.findAll();
    }


    @Override
    public Page<Product> findAllProductByName(Pageable pageable, String searchName) {
        return this.iProductRepository.findAllProductByName("%"+ searchName +"%",pageable);
    }

    @Override
    public Product findByIdProduct(int id) {
        return this.iProductRepository.findDetailProductById(id);
    }

    @Override
    public List<Product> newProduct() {

        return this.iProductRepository.getNewProduct();
    }



}
