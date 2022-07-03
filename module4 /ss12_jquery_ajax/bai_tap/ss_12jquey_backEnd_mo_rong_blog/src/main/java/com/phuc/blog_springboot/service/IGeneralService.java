package com.phuc.blog_springboot.service;

import java.util.Optional;

public interface IGeneralService <T>{
    T save(T t);
    Iterable<T> findAll();

    Optional<T> findById(int id);

    void remove(int id);
}
