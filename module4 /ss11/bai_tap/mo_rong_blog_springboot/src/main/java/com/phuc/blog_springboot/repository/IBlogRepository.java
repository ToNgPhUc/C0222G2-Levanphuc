package com.phuc.blog_springboot.repository;

import com.phuc.blog_springboot.model.Blog;
import com.phuc.blog_springboot.model.Blogger;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IBlogRepository extends JpaRepository<Blog, Integer> {
    @Query(value = "select * from blog", nativeQuery = true)
    Page<Blog> findAll(Pageable pageable);


    @Query(value = "select * from blog where id = :id", nativeQuery = true)
    Blog findByIdBlog(@Param("id") int id);

//    @Query(value = "select * from blog where name_blog like :keywordVar", nativeQuery = true)
//    Page<Blog> findAllByName(@Param("keywordVar") String keywordVar, Pageable pageable);

    @Query(value = " select * from blog where name_blog like :keywordVar ", nativeQuery = true ,
            countQuery = " select count(*) from (select * from blog where name_blog like :keywordVar) temp_table ")
    Page<Blog> findAllByName(@Param("keywordVar") String  keywordVar,Pageable pageable);
}
