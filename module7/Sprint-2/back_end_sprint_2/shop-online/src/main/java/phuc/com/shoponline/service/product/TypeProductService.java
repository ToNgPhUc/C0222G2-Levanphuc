package phuc.com.shoponline.service.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import phuc.com.shoponline.model.product.TypeProduct;
import phuc.com.shoponline.repository.product.ITypeProductRepository;

import java.util.List;

@Service
public class TypeProductService implements ITypeProductService {
    @Autowired
    private ITypeProductRepository iTypeProductRepository;

    @Override
    public List<TypeProduct> getAllListDishType() {
        return this.iTypeProductRepository.findAll();
    }
}
