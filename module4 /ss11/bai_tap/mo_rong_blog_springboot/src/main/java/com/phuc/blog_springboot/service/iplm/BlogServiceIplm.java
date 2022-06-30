package com.phuc.blog_springboot.service.iplm;

import com.phuc.blog_springboot.model.Blog;
import com.phuc.blog_springboot.model.Blogger;
import com.phuc.blog_springboot.repository.IBlogRepository;
import com.phuc.blog_springboot.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BlogServiceIplm implements IBlogService {
    @Autowired
    private IBlogRepository iBlogRepository;

    @Override
    public Page<Blog> findAll(Pageable pageable) {
        return iBlogRepository.findAll(pageable);
    }



    @Override
    public void save(Blog blog) {
        iBlogRepository.save(blog);
    }

    @Override
    public Blog findByIdBlog(int id) {
        return iBlogRepository.findByIdBlog(id);
    }
//    orElse(null);

    @Override
    public void deleteById(Integer id) {
        iBlogRepository.deleteById(id);
    }

    @Override
    public Page<Blog> findAllByName(String keywordVar, Pageable pageable) {
        return iBlogRepository.findAllByName("%" + keywordVar + "%",pageable);
    }

    @Override
    public Optional<Blog> findById(int idBlog) {
        return iBlogRepository.findById(idBlog);
    }
}
