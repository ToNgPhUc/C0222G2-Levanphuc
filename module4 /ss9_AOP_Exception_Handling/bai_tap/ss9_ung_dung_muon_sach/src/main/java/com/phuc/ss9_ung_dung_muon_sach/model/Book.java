package com.phuc.ss9_ung_dung_muon_sach.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_book")
    private Integer idBook;
    @Column(name = "name_book")
    private String nameBook;
    private Integer quantity;
    @OneToMany(mappedBy = "idBook")
    private List<DetailsBook> detailsBookList;

    public Book() {
    }

    public Book(Integer idBook, String nameBook, Integer quantity, List<DetailsBook> detailsBookList) {
        this.idBook = idBook;
        this.nameBook = nameBook;
        this.quantity = quantity;
        this.detailsBookList = detailsBookList;
    }

    public Integer getIdBook() {
        return idBook;
    }

    public void setIdBook(Integer idBook) {
        this.idBook = idBook;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public List<DetailsBook> getDetailsBookList() {
        return detailsBookList;
    }

    public void setDetailsBookList(List<DetailsBook> detailsBookList) {
        this.detailsBookList = detailsBookList;
    }
}
