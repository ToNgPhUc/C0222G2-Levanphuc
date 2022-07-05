package com.phuc.spring_security.repository;


import com.phuc.spring_security.model.AppUser;
import com.phuc.spring_security.model.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRoleRepository extends JpaRepository<UserRole, Long> {
    List<UserRole> findAllByAppUser(AppUser appUser);
}
