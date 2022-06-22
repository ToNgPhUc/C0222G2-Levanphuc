package com.phuc.blog_springboot.service;

import com.phuc.blog_springboot.model.Blog;

import java.util.List;
import java.util.Optional;

public interface IBlogService {
    List<Blog> findAllBlog();

    void save(Blog blog);

    Optional<Blog> findById(int id);


    void deleteById(Integer id);
}
