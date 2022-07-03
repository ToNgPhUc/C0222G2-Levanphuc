package com.phuc.blog_springboot.controller;

import com.phuc.blog_springboot.model.Blog;
import com.phuc.blog_springboot.model.Blogger;
import com.phuc.blog_springboot.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/blog_restful")
@CrossOrigin
public class BlogRestfulController {

    @Autowired
    private IBlogService iBlogService;


//    @GetMapping(value = "blog")
//    public ResponseEntity<Page<Blog>> findAllPageBlog(@PageableDefault(value = 2) Pageable pageable){
//        Page<Blog> blogList = iBlogService.findAll(pageable);
//        if (!blogList.hasContent()){
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }return new ResponseEntity<>(blogList,HttpStatus.OK);
////    }


// lấy list về theo kiểu phân trang cộng tìm kiếm
    @GetMapping(value = "blog")
    public ResponseEntity<Page<Blog>> findAllPageBlog(
                               @PageableDefault(value = 3) Pageable pageable,
                               @RequestParam Optional<String> keyword) {
        String keywordVar = keyword.orElse("");

        Page<Blog> blogList= this.iBlogService.findAllByName(keywordVar,pageable);
//        if (!blogList.hasContent()){
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
        return new ResponseEntity<>(blogList,HttpStatus.OK);
    }

    @PostMapping(value = "create")
    public ResponseEntity<Blog> saveBlog(@RequestBody Blog blog) {
        return new ResponseEntity<>(iBlogService.save(blog), HttpStatus.CREATED);
    }



    @GetMapping("/{id}")
    public ResponseEntity<Blog> findBlogById(@PathVariable int id) {
        Optional<Blog> blogOptional = iBlogService.findById(id);
        if (!blogOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(blogOptional.get(), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Blog> updateBlog(@PathVariable int id, @RequestBody Blog blog) {
        Optional<Blog> blogOptional = iBlogService.findById(id);
        if (!blogOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        blog.setId(blogOptional.get().getId());
        return new ResponseEntity<>(iBlogService.save(blog), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Blog> deleteBlog(@PathVariable int id) {
        Optional<Blog> blogOptional = iBlogService.findById(id);
        if (!blogOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        iBlogService.remove(id);
        return new ResponseEntity<>(blogOptional.get(), HttpStatus.NO_CONTENT);
    }


    //  ((((((  lấy list về theo kiểu list  )))))
//    @GetMapping(value = "blog")
//    public ResponseEntity<Iterable<Blog>> findAllBlog() {
//        List<Blog> blogList = (List<Blog>) iBlogService.findAll();
//        if (blogList.isEmpty()) {
//            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//        }
//        return new ResponseEntity<>(blogList, HttpStatus.OK);
//    }


}
