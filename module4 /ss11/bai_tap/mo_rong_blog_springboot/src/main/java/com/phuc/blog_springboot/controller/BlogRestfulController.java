package com.phuc.blog_springboot.controller;

import com.phuc.blog_springboot.model.Blog;
import com.phuc.blog_springboot.model.Blogger;
import com.phuc.blog_springboot.service.IBlogService;
import com.phuc.blog_springboot.service.IBloggerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/blog_restful")
public class BlogRestfulController {
    @Autowired
    private IBloggerService iBloggerService;
    @Autowired
    private IBlogService iBlogService;

    @GetMapping(value = "blogger")
    public ResponseEntity<Iterable<Blogger>> findAllBlogger() {
        List<Blogger> bloggerList = iBloggerService.findAll();
        if (bloggerList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(bloggerList, HttpStatus.OK);
    }
    @GetMapping("/blogger/{idBlogger}")
    public ResponseEntity<Blogger> findBloggerById(@PathVariable int idBlogger) {
        Optional<Blogger> bloggerOptional = iBloggerService.findById(idBlogger);
        if (!bloggerOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(bloggerOptional.get(), HttpStatus.OK);
    }
    @GetMapping(value = "blog")
    public ResponseEntity<Page<Blog>> findAllPageBlog(@PageableDefault(value = 3) Pageable pageable){
        Page<Blog> blogList = iBlogService.findAll(pageable);
        if (!blogList.hasContent()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }return new ResponseEntity<>(blogList,HttpStatus.OK);
    }
    @GetMapping("/blog/{idBlog}")
    public ResponseEntity<Blog> findBlogById(@PathVariable int idBlog) {
        Optional<Blog> blogOptional = iBlogService.findById(idBlog);
        if (!blogOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(blogOptional.get(), HttpStatus.OK);
    }
}
