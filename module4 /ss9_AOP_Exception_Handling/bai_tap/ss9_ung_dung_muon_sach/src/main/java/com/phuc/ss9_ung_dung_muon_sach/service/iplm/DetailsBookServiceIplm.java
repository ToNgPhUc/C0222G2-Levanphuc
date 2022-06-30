package com.phuc.ss9_ung_dung_muon_sach.service.iplm;

import com.phuc.ss9_ung_dung_muon_sach.model.Book;
import com.phuc.ss9_ung_dung_muon_sach.model.DetailsBook;
import com.phuc.ss9_ung_dung_muon_sach.repository.IBookRepository;
import com.phuc.ss9_ung_dung_muon_sach.repository.IDetailsBookRepository;
import com.phuc.ss9_ung_dung_muon_sach.service.IBookService;
import com.phuc.ss9_ung_dung_muon_sach.service.IDetailsBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetailsBookServiceIplm implements IDetailsBookService {
    @Autowired
    private IDetailsBookRepository iDetailsBookRepository;

    @Autowired
    private IBookRepository ibookRepository;

    @Override
    public List<DetailsBook> findAll() {
        return iDetailsBookRepository.findAll();
    }

    @Override
    public DetailsBook findByIdDetailsBook(int idDetails) {
        return iDetailsBookRepository.findByIdDetailsBook(idDetails);
    }


    @Override
    public void createDetail(Integer idBook) {
        Book book = this.ibookRepository.getById(idBook);
        for (int i = 0; i < book.getQuantity(); i++) {

            DetailsBook detailsBook = new DetailsBook();
            detailsBook.setIdBook(book);
            detailsBook.setStatus(0);
            this.iDetailsBookRepository.save(detailsBook);
        }
    }

    @Override
    public void deleteById(Integer idDetails) {
        iDetailsBookRepository.deleteById(idDetails);
    }
}
