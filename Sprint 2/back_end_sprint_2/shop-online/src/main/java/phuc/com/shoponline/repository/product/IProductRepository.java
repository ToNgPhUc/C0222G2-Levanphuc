package phuc.com.shoponline.repository.product;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import phuc.com.shoponline.model.product.Product;


public interface IProductRepository extends JpaRepository<Product,Integer> {
   @Query(value = " select product.* from product where `name` like :searchName ",nativeQuery = true,
   countQuery = " select count(*) from ( select product.* from product where `name` like :searchName ) as abc")
    Page<Product> findAllProductByName(@Param("searchName") String searchName,Pageable pageable);
}
