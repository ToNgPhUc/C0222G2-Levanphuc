package phuc.com.shoponline.service.product;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import phuc.com.shoponline.model.product.Product;

import java.util.List;

public interface IproductService {

    void save(Product product);

    List<Product> findAll();

    Page<Product> findAllProductByName(Pageable pageable, String searchName);
}
