package com.phuc.blog_springboot.controller;

import com.phuc.blog_springboot.model.Blog;
import com.phuc.blog_springboot.service.IBlogService;
import com.phuc.blog_springboot.service.IBloggerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping(value = "/blog")
public class BlogController {
    @Autowired
    private IBlogService iBlogService;
    @Autowired
    private IBloggerService iBloggerService;

    @GetMapping(value = "")
    public String showListBlog(Model model,
                               @PageableDefault(value = 3) Pageable pageable,
                               @RequestParam Optional<String> keyword) {
        String keywordVar = keyword.orElse("");

        Page<Blog> blogList= this.iBlogService.findAllByName(keywordVar,pageable);
        model.addAttribute("keywordVar", keywordVar);
        model.addAttribute("blogList", blogList);

        return "blog_list";
    }

    @GetMapping(value = "create")
    public String showFormCreate(Model model) {
        model.addAttribute("blog", new Blog());
        model.addAttribute("bloggerList", iBloggerService.findAll());
        return "create";
    }

    @PostMapping(value = "save")
    public String createBlog(@ModelAttribute Blog blog) {
        iBlogService.save(blog);
        return "redirect:/blog";
    }

    @GetMapping(value = "/{id}/edit")
    public String showFormEdit(@PathVariable int id, Model model) {
        model.addAttribute("bloggerList", iBloggerService.findAll());

        model.addAttribute("blog", iBlogService.findByIdBlog(id));
        return "/edit";
    }

    @PostMapping(value = "/edit")
    public String editBlog(@ModelAttribute Blog blog) {
        iBlogService.save(blog);
        return "redirect:/blog";
    }

    @GetMapping(value = "/{id}/delete")
    public String showFormDelete(@PathVariable int id, Model model) {
        model.addAttribute("bloggerList", iBloggerService.findAll());
        model.addAttribute("blog", iBlogService.findByIdBlog(id));
        return "/delete";
    }

    @PostMapping(value = "/delete")
    public String deleteBlog(@ModelAttribute Blog blog) {
        iBlogService.deleteById(blog.getId());
        return "redirect:/blog";
    }

    @GetMapping("/{id}/view")
    public String view(@PathVariable int id, Model model) {
        model.addAttribute("bloggerList", iBloggerService.findAll());
        model.addAttribute("blog", iBlogService.findByIdBlog(id));
        return "view";
    }

}
