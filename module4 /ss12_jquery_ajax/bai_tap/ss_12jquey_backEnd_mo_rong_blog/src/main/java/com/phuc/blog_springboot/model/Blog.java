package com.phuc.blog_springboot.model;

import javax.persistence.*;

@Entity
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name_blog")
    private String nameBlog;
    private String content;
    @ManyToOne
    @JoinColumn(name ="id_blogger", referencedColumnName = "id_blogger")
    private Blogger blogger;

    public Blog() {
    }

    public Blog(Integer id, String nameBlog, String content, Blogger blogger) {
        this.id = id;
        this.nameBlog = nameBlog;
        this.content = content;
        this.blogger = blogger;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameBlog() {
        return nameBlog;
    }

    public void setNameBlog(String nameBlog) {
        this.nameBlog = nameBlog;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Blogger getBlogger() {
        return blogger;
    }

    public void setBlogger(Blogger blogger) {
        this.blogger = blogger;
    }
}
