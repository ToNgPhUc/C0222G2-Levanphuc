package com.phuc.baithimodule5.controller;

import com.phuc.baithimodule5.model.LoHang;
import com.phuc.baithimodule5.model.SanPham;
import com.phuc.baithimodule5.service.ILoHangService;

import com.phuc.baithimodule5.service.ISanPhamService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/quan-li-san-pham")
public class LoHangController {
    @Autowired
    private ILoHangService iLoHangService;
    @Autowired
    private ISanPhamService iSanPhamService;

    @GetMapping("lo-hang")
    public ResponseEntity<List<LoHang>> getLoHang() {
        List<LoHang> loHangList = this.iLoHangService.getAllLoHang();
        return new ResponseEntity<>(loHangList, HttpStatus.OK);
    }

    @GetMapping("san-pham")
    public ResponseEntity<List<SanPham>> getSanPham() {
        List<SanPham> sanPhamList = this.iSanPhamService.getAllSanPham();
        return new ResponseEntity<>(sanPhamList, HttpStatus.OK);
    }

    @PostMapping(value = "create")
    public ResponseEntity<LoHang> saveLoHang(@RequestBody LoHang loHang) {
        return new ResponseEntity<>(iLoHangService.save(loHang), HttpStatus.CREATED);
    }


}
