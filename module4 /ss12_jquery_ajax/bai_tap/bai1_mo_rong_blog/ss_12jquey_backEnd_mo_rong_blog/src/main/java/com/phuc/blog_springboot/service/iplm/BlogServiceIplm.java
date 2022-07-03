package com.phuc.blog_springboot.service.iplm;

import com.phuc.blog_springboot.model.Blog;
import com.phuc.blog_springboot.repository.IBlogRepository;
import com.phuc.blog_springboot.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BlogServiceIplm implements IBlogService {

    @Autowired
    private IBlogRepository iBlogRepository;


    @Override
    public Blog save(Blog blog) {
        return iBlogRepository.save(blog);
    }

    // lấy theo kiểu list
    @Override
    public Iterable<Blog> findAll() {
        return iBlogRepository.findAll();
    }

    @Override
    public Optional<Blog> findById(int id) {
        return iBlogRepository.findById(id);
    }

    @Override
    public void remove(int id) {
        iBlogRepository.deleteById(id);
    }




    // lấy theo dạng phân trang
    @Override
    public Page<Blog> findAll(Pageable pageable) {
        return iBlogRepository.findAll(pageable);
    }

    @Override
    public Page<Blog> findAllByName(String keywordVar, Pageable pageable) {
        return iBlogRepository.findAllByName("%" + keywordVar + "%",pageable);
    }


////    @Override
////    public void save(Blog blog) {
////        iBlogRepository.save(blog);
////    }
//
//    @Override
//    public Blog findByIdBlog(int id) {
//        return iBlogRepository.findByIdBlog(id);
//    }
////    orElse(null);
//
//    @Override
//    public void deleteById(Integer id) {
//        iBlogRepository.deleteById(id);
//    }
//
//
//
//    @Override
//    public Optional<Blog> findById(int idBlog) {
//        return iBlogRepository.findById(idBlog);
//    }
//
//    @Override
//    public List getAllBlogList() {
////        return iBlogRepository.findAll();
//    }


}
