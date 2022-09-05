package com.phuc.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/quan-li-san-pham")
public class LoHangController {
    @Autowired
    private ILoHangService iLoHangService;
    @Autowired
    private ISanPhamService iSanPhamService;



    public ResponseEntity<Iterable<LoHang>> findAll() {
        List<LoHang> bloggerList = iLoHangService.findAll();
        if (bloggerList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(bloggerList, HttpStatus.OK);
    }
}
