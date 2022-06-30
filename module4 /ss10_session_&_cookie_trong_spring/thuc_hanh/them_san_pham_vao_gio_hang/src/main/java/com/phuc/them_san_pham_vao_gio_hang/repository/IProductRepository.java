package com.phuc.them_san_pham_vao_gio_hang.repository;

import com.phuc.them_san_pham_vao_gio_hang.model.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductRepository extends PagingAndSortingRepository<Product, Long> {
    @Query(value = "select  * from  product where id= :id",nativeQuery = true)
    Product findByIdProduct(@Param("id")long id);

}
