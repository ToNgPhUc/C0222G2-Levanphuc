package com.phuc.ss9_ung_dung_muon_sach.controller;

import com.phuc.ss9_ung_dung_muon_sach.model.Book;
import com.phuc.ss9_ung_dung_muon_sach.model.DetailsBook;
import com.phuc.ss9_ung_dung_muon_sach.service.IBookService;
import com.phuc.ss9_ung_dung_muon_sach.service.IDetailsBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping(value = "/book")
public class BookController {
    @Autowired
    private IBookService iBookService;
    @Autowired
    private IDetailsBookService iDetailsBookService;

    @GetMapping(value = "")
    public String showList(Model model) {
        model.addAttribute("bookList", this.iBookService.findAll());
        return "/book_list";
    }

    @GetMapping(value = "listDetails")
    public String showListDetails(Model model, @RequestParam Integer idBook) {
        this.iDetailsBookService.createDetail(idBook);
        model.addAttribute("detailsBookList", this.iDetailsBookService.findAll());
        return "/details_book_list";
    }

    @GetMapping(value = "/{idDetails}/brow_book")
    public String formBrowBook(@PathVariable int idDetails, Model model) {
        model.addAttribute("detailsBook", iDetailsBookService.findByIdDetailsBook(idDetails));
        return "brow_book";
    }

    @PostMapping(value = "/brow_book")
    public String deleteBook(@ModelAttribute DetailsBook detailsBook) {
        iDetailsBookService.deleteById(detailsBook.getIdDetails());
        return "redirect:/book";
    }
}
