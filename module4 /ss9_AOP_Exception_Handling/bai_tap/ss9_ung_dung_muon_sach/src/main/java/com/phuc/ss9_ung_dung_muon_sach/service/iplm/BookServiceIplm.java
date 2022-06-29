package com.phuc.ss9_ung_dung_muon_sach.service.iplm;

import com.phuc.ss9_ung_dung_muon_sach.model.Book;
import com.phuc.ss9_ung_dung_muon_sach.model.DetailsBook;
import com.phuc.ss9_ung_dung_muon_sach.repository.IBookRepository;
import com.phuc.ss9_ung_dung_muon_sach.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceIplm implements IBookService {
    @Autowired
    private IBookRepository iBookRepository;

    @Override
    public List<Book> findAll() {
        return iBookRepository.findAll();
    }


}
