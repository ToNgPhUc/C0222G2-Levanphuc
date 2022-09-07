package com.example.demo.repository;

import com.example.demo.model.Dish;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IDishRepository extends JpaRepository<Dish,Integer> {

    @Query(value = " select d.id, d.code, d.image, d.is_deleted, d.name, d.price, d.dish_type_id from dish d " +
            " join dish_type dt on dt.id = d.dish_type_id " +
            " where d.name like :name and d.code like :code and d.price like :price and d.dish_type_id like :dishType and d.is_deleted = 0 ", nativeQuery = true,
            countQuery = " select count(*) from ( select d.id, d.code,  d.image, d.is_deleted, d.name, d.price, d.dish_type_id from dish d " +
                    " join dish_type dt on dt.id = d.dish_type_id " +
                    " where d.name like :name and d.code like :code and d.price like :price and d.dish_type_id like :dishType and d.is_deleted = 0 ) temp_table ")
    Page<Dish> searchDishPage(@Param("name") String name, @Param("code") String code, @Param("price") String price, @Param("dishType") String dishType, Pageable pageable);
}
