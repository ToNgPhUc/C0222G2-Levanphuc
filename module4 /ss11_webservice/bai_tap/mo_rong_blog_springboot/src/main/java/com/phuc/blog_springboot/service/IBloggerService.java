package com.phuc.blog_springboot.service;

import com.phuc.blog_springboot.model.Blogger;

import java.util.List;
import java.util.Optional;

public interface IBloggerService {
    List<Blogger> findAll();

    Optional<Blogger> findById(int id);
}
