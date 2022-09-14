package phuc.com.shoponline.repository.product;

import org.springframework.data.jpa.repository.JpaRepository;
import phuc.com.shoponline.model.product.TypeProduct;

public interface ITypeProductRepository  extends JpaRepository<TypeProduct,Integer> {
}
