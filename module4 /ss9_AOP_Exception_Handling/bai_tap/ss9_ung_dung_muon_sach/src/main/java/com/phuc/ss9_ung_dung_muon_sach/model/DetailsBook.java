package com.phuc.ss9_ung_dung_muon_sach.model;

import javax.persistence.*;

@Entity
public class DetailsBook {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_details")
    private Integer idDetails;
    @ManyToOne
    @JoinColumn(name = "id_book",referencedColumnName = "id_book")
    private Book idBook;
    private Integer status;

    public DetailsBook() {
    }

    public DetailsBook(Integer idDetails, Book idBook, Integer status) {
        this.idDetails = idDetails;
        this.idBook = idBook;
        this.status = status;
    }

    public Integer getIdDetails() {
        return idDetails;
    }

    public void setIdDetails(Integer idDetails) {
        this.idDetails = idDetails;
    }

    public Book getIdBook() {
        return idBook;
    }

    public void setIdBook(Book idBook) {
        this.idBook = idBook;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
