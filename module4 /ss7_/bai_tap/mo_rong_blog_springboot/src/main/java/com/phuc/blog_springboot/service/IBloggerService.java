package com.phuc.blog_springboot.service;

import com.phuc.blog_springboot.model.Blogger;

import java.util.List;

public interface IBloggerService {
    List<Blogger> findAll();
}
