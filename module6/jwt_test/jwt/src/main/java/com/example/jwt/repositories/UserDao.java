package com.example.jwt.repositories;


import com.example.jwt.entity.DAOUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<DAOUser, Integer> {

    DAOUser findByUsername(String username);
}