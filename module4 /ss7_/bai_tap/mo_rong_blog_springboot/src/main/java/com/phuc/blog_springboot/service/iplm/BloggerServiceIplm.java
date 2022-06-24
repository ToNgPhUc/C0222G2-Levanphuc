package com.phuc.blog_springboot.service.iplm;

import com.phuc.blog_springboot.model.Blogger;
import com.phuc.blog_springboot.repository.IBloggerRepository;
import com.phuc.blog_springboot.service.IBloggerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BloggerServiceIplm implements IBloggerService {
    @Autowired
    private IBloggerRepository iBloggerRepository;
    @Override
    public List<Blogger> findAll() {
        return iBloggerRepository.findAllBlogger();
    }
}
