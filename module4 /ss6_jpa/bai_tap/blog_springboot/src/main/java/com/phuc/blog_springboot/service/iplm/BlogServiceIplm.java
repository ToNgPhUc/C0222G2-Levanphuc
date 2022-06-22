package com.phuc.blog_springboot.service.iplm;

import com.phuc.blog_springboot.model.Blog;
import com.phuc.blog_springboot.repository.IBlogRepository;
import com.phuc.blog_springboot.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BlogServiceIplm implements IBlogService {
    @Autowired
    private IBlogRepository iBlogRepository;

    @Override
    public List<Blog> findAllBlog() {
        return iBlogRepository.findAllBlog();
    }

    @Override
    public void save(Blog blog) {
        iBlogRepository.save(blog);
    }

    @Override
    public Optional<Blog> findById(int id) {
        return iBlogRepository.findById(id);
    }

    @Override
    public void deleteById(Integer id) {
        iBlogRepository.deleteById(id);
    }

}
