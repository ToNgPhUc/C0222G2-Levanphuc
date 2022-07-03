package com.phuc.blog_springboot.service;

import com.phuc.blog_springboot.model.Blog;
import com.phuc.blog_springboot.model.Blogger;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface IBlogService extends IGeneralService<Blog>  {

    Page<Blog> findAll(Pageable pageable);

    Page<Blog> findAllByName(String keywordVar, Pageable pageable);

//    void save(Blog blog);

//    Blog findByIdBlog(int id);
//
//
//    void deleteById(Integer id);
//

//

//
//    Optional<Blog> findById(int idBlog);
//
}
