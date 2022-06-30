package com.phuc.blog_springboot.repository;

import com.phuc.blog_springboot.model.Blogger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IBloggerRepository extends JpaRepository<Blogger, Integer> {
    @Query(value = "select * from blogger",nativeQuery = true)
    List<Blogger> findAllBlogger();
}
