package com.phuc.quan_li_kho_hang.controller;


import com.phuc.quan_li_kho_hang.model.LoHang;
import com.phuc.quan_li_kho_hang.model.SanPham;
import com.phuc.quan_li_kho_hang.service.ILoHangService;
import com.phuc.quan_li_kho_hang.service.ISanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@CrossOrigin
@RequestMapping("/quan-li-lo-hang")
public class LoHangController {
    @Autowired
    private ILoHangService iLoHangService;
    @Autowired
    private ISanPhamService iSanPhamService;

//    @GetMapping("/lo-hang")
//    public ResponseEntity<List<LoHang>> getLoHang() {
//        List<LoHang> loHangList = this.iLoHangService.getAllLoHang();
//        return new ResponseEntity<>(loHangList, HttpStatus.OK);
//    }
//        @GetMapping(value = "/lo-hang")
//    public ResponseEntity<Page<LoHang>> findAllPageBlog(@PageableDefault(value = 2) Pageable pageable){
//        Page<LoHang> blogList = iLoHangService.findAll(pageable);
//
//        if (!blogList.hasContent()){
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }return new ResponseEntity<>(blogList,HttpStatus.OK);
//    }
@GetMapping(value = "lo-hang")
public ResponseEntity<Page<LoHang>> findAllPageBlog(
        @PageableDefault(value = 3) Pageable pageable,
        @RequestParam Optional<String> search,
        @RequestParam Optional<String> ngayNhapHang) {
    String searchName = search.orElse("");
    String ngayNhapHangSearch = ngayNhapHang.orElse("");
    System.out.println(searchName);
    Page<LoHang> loHangList= this.iLoHangService.findAllByName(searchName,ngayNhapHangSearch,pageable);
        if (!loHangList.hasContent()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    return new ResponseEntity<>(loHangList,HttpStatus.OK);
}

    @GetMapping("/san-pham")
    public ResponseEntity<List<SanPham>> getSanPham() {
        List<SanPham> sanPhamList = this.iSanPhamService.getAllSanPham();
        return new ResponseEntity<>(sanPhamList, HttpStatus.OK);
    }

    @PostMapping(value = "/create")
    public ResponseEntity<LoHang> createLoHang(@RequestBody LoHang loHang) {

        return new ResponseEntity<>(iLoHangService.save(loHang), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<LoHang> findBlogById(@PathVariable int id) {
        Optional<LoHang> loHangOptional = iLoHangService.findById(id);
        if (!loHangOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(loHangOptional.get(), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<LoHang> deleteLoHang(@PathVariable int id) {
        Optional<LoHang> loHangOptional = iLoHangService.findById(id);
        if (!loHangOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        iLoHangService.remove(id);
        return new ResponseEntity<>(loHangOptional.get(), HttpStatus.NO_CONTENT);
    }
    @PutMapping("/{id}")
    public ResponseEntity<LoHang> updateLoHang(@PathVariable int id, @RequestBody LoHang loHang) {
        Optional<LoHang> blogOptional = iLoHangService.findById(id);
        if (!blogOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        loHang.setId(blogOptional.get().getId());
        return new ResponseEntity<>(iLoHangService.save(loHang), HttpStatus.OK);
    }



}