package phuc.com.shoponline.repository.product;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import phuc.com.shoponline.model.product.Product;

import java.util.List;
import java.util.Optional;


public interface IProductRepository extends JpaRepository<Product, Integer> {
    @Query(value = " select product.* from product where `name` like :searchName ", nativeQuery = true,
            countQuery = " select count(*) from ( select product.* from product where `name` like :searchName ) as abc")
    Page<Product> findAllProductByName(@Param("searchName") String searchName, Pageable pageable);

    @Modifying
    @Transactional
    @Query(value = " UPDATE `product` SET `quantity` = (`quantity` - :quantity) WHERE (`id` = :id) ", nativeQuery = true)
    void updateQuantity(@Param("quantity") Integer quantity, @Param("id") Integer id);

    @Modifying
    @Transactional
    @Query(value = " UPDATE `product` SET `is_deleted` = 1 WHERE (`id` = :id) ", nativeQuery = true)
    void updateIsDeleted(@Param("id") Integer id);

    @Query(value = "select p.* from product p where id = :id ", nativeQuery = true)
    Product findDetailProductById(@Param("id") int id);

    @Query(value = "select * from product order by creation_date desc limit 6 ", nativeQuery = true)
    List<Product> getNewProduct();
}
