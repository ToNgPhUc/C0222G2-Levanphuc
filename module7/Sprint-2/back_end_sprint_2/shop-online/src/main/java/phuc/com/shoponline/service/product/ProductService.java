package phuc.com.shoponline.service.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import phuc.com.shoponline.model.product.Product;
import phuc.com.shoponline.repository.product.IProductRepository;

import java.util.List;

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


}
