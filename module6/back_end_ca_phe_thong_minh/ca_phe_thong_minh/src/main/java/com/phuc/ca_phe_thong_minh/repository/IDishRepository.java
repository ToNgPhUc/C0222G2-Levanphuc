package com.phuc.ca_phe_thong_minh.repository;


import com.phuc.ca_phe_thong_minh.model.Dish;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;


import java.util.Optional;


public interface IDishRepository extends JpaRepository<Dish, Integer> {


    @Query(value = "select * from dish where id = :id", nativeQuery = true)
    Optional<Dish> findByIdDish(@Param("id") int id);


    @Transactional
    @Modifying
    @Query(value = " INSERT INTO dish (`dish_type_id`, image, `name`, code, price) " +
            " VALUES (:#{#dish.dishType.id}, :#{#dish.image}, :#{#dish.name}, :#{#dish.code}, " +
            " :#{#dish.price}); ", nativeQuery = true)
    void saveDish(Dish dish);

    @Modifying
    @Transactional
    @Query(value = " update dish set `name`= :#{#dish.name}, image = :#{#dish.image}, code = :#{#dish.code},  price = :#{#dish.price}, dish_type_id = :#{#dish.dishType.id} where id= :#{#dish.id}", nativeQuery = true)
    void editDish(Dish dish);

}


