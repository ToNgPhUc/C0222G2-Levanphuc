package com.phuc.ss9_ung_dung_muon_sach.repository;

import com.phuc.ss9_ung_dung_muon_sach.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBookRepository extends JpaRepository<Book,Integer> {
}
