package com.phuc.ss10_them_sp_vao_gio_hang_list.repository;

import com.phuc.ss10_them_sp_vao_gio_hang_list.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IProductRepository extends JpaRepository<Product, Integer> {
}