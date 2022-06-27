package com.phuc.validate_quan_li_san_pham_ss8.repository;

import com.phuc.validate_quan_li_san_pham_ss8.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IProductRepository extends JpaRepository<Product, Integer> {

    @Query(value = " select  * from product where name_product like :searchType", nativeQuery = true,
            countQuery = "select count(*) from (select  * from product where name_product like :searchType)temp_table")
    Page<Product> findByName(@Param("searchType") String searchType, Pageable pageable);


    @Query(value = "select  * from product where id_product = :idProduct", nativeQuery = true)
    Product findByIdProduct(@Param("idProduct") int idProduct);
}
