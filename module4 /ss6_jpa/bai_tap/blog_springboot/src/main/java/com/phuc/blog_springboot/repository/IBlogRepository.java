package com.phuc.blog_springboot.repository;

import com.phuc.blog_springboot.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IBlogRepository extends JpaRepository<Blog, Integer> {
    @Query(value = "select * from blog", nativeQuery = true)
    List<Blog> findAllBlog();

    @Query(value = "select * from blog where id = :id", nativeQuery = true)
    Blog findByIdBlog(@Param("id")int id);


}
