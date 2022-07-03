package com.phuc.blog_springboot.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.nio.MappedByteBuffer;
import java.util.List;

@Entity
public class Blogger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_blogger")
    private Integer idBlogger;

    @Column(name = "name_blogger")
    private String nameBlogger;
    private Integer age;
    private String experience;

    @OneToMany(mappedBy = "blogger")
    @JsonBackReference
    private List<Blog> blogList;

    public Blogger() {
    }

    public Blogger(Integer idBlogger, String nameBlogger, Integer age, String experience, List<Blog> blogList) {
        this.idBlogger = idBlogger;
        this.nameBlogger = nameBlogger;
        this.age = age;
        this.experience = experience;
        this.blogList = blogList;
    }

    public Integer getIdBlogger() {
        return idBlogger;
    }

    public void setIdBlogger(Integer idBlogger) {
        this.idBlogger = idBlogger;
    }

    public String getNameBlogger() {
        return nameBlogger;
    }

    public void setNameBlogger(String nameBlogger) {
        this.nameBlogger = nameBlogger;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public List<Blog> getBlogList() {
        return blogList;
    }

    public void setBlogList(List<Blog> blogList) {
        this.blogList = blogList;
    }
}
