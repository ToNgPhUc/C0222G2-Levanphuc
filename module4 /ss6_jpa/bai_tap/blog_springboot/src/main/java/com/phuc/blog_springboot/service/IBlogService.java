package com.phuc.blog_springboot.service;

import com.phuc.blog_springboot.model.Blog;

import java.util.List;

public interface IBlogService {
    List<Blog> findAllBlog();

    void save(Blog blog);

    Blog findByIdBlog(int id);


    void deleteById(Integer id);
}
