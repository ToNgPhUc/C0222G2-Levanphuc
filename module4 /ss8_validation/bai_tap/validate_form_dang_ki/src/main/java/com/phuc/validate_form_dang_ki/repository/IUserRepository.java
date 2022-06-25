package com.phuc.validate_form_dang_ki.repository;


import com.phuc.validate_form_dang_ki.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User,Integer> {
}
