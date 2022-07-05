package com.phuc.spring_security.repository;
;
import com.phuc.spring_security.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository<AppUser, Long> {
    AppUser findAppUserByUserName(String username);
}
