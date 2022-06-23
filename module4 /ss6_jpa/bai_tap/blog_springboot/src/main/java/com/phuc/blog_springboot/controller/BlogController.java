package com.phuc.blog_springboot.controller;

import com.phuc.blog_springboot.model.Blog;
import com.phuc.blog_springboot.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/blog")
public class BlogController {
    @Autowired
    private IBlogService iBlogService;

    @GetMapping(value = "")
    public String showListBlog(Model model) {
        model.addAttribute("blogList", iBlogService.findAllBlog());
        return "blog_list";
    }
    @GetMapping(value = "create")
    public String showFormCreate(Model model){
        model.addAttribute("blog",new Blog());
        return "create";
    }
    @PostMapping(value = "save")
    public String createBlog(@ModelAttribute Blog blog){
        iBlogService.save(blog);
        return "redirect:/blog";
    }
    @GetMapping(value = "/{id}/edit")
    public String showFormEdit(@PathVariable int id, Model model ){
        model.addAttribute("blog",iBlogService.findByIdBlog(id));
        return "/edit";
    }
    @PostMapping(value = "/edit")
    public String editBlog( @ModelAttribute Blog blog){
        iBlogService.save(blog);
        return "redirect:/blog";
    }
    @GetMapping(value = "/{id}/delete")
    public String showFormDelete( @PathVariable int id, Model model){
        model.addAttribute("blog",iBlogService.findByIdBlog(id));
        return "/delete";
    }

    @PostMapping(value = "/delete")
    public String deleteBlog( @ModelAttribute Blog blog){
        iBlogService.deleteById(blog.getId());
        return "redirect:/blog";
    }
    @GetMapping("/{id}/view")
    public String view(@PathVariable int id, Model model) {
        model.addAttribute("blog", iBlogService.findByIdBlog(id));
        return "view";
    }

}
