package com.phuc.ss9_ung_dung_muon_sach.service;

import com.phuc.ss9_ung_dung_muon_sach.model.DetailsBook;

import java.util.List;

public interface IDetailsBookService {
    List<DetailsBook> findAll();

    DetailsBook findByIdDetailsBook(int idDetails);

 

    void createDetail(Integer idBook);

    void deleteById(Integer idDetails);
}
