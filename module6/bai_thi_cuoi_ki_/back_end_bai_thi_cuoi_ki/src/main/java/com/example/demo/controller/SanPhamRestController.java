package com.example.demo.controller;

import com.example.demo.dto.SanPhamDto;
import com.example.demo.model.LoaiSanPham;
import com.example.demo.model.SanPham;
import com.example.demo.service.sanPham.ILoaiSanPhamService;
import com.example.demo.service.sanPham.ISanPhamService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping(value = "/sanPham")
public class SanPhamRestController {
    @Autowired
    private ISanPhamService iSanPhamService;
    @Autowired
    private ILoaiSanPhamService iLoaiSanPhamService;


    @GetMapping("/loai-san-pham")
    public ResponseEntity<List<LoaiSanPham>> getLoaiSanPham() {
        List<LoaiSanPham> loaiSanPhamList = this.iLoaiSanPhamService.getAllLoaiSanPham();
        return new ResponseEntity<>(loaiSanPhamList, HttpStatus.OK);
    }

    @GetMapping("")
    public ResponseEntity<List<SanPham>> getSanPham() {
        List<SanPham> sanPhamList = this.iSanPhamService.getAll();
        return new ResponseEntity<>(sanPhamList, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<SanPham> findBlogById(@PathVariable int id) {
        Optional<SanPham> sanPhamOptional = iSanPhamService.findById(id);
        if (!sanPhamOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(sanPhamOptional.get(), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<SanPham> deleteSanPham(@PathVariable int id) {
        Optional<SanPham> loHangOptional = iSanPhamService.findById(id);
        if (!loHangOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        iSanPhamService.remove(id);
        return new ResponseEntity<>(loHangOptional.get(), HttpStatus.NO_CONTENT);
    }


    //    @PostMapping(value = "/create")
//    public ResponseEntity<SanPham> createSanPham(@RequestBody SanPham sanPham) {
//
//        return new ResponseEntity<>(iSanPhamService.save(sanPham), HttpStatus.CREATED);
//    }
    @PostMapping(value = "/create")
    public ResponseEntity<FieldError> createSanPham(@RequestBody @Valid SanPhamDto sanPhamDto,
                                                    BindingResult bindingResult) {

        sanPhamDto.setSanPhamList(this.iSanPhamService.getAll());
        sanPhamDto.validate(sanPhamDto, bindingResult);

        if (bindingResult.hasErrors()) {
            return new ResponseEntity<>(bindingResult.getFieldError(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
        SanPham sanPham = new SanPham();
        BeanUtils.copyProperties(sanPhamDto, sanPham);
        iSanPhamService.save(sanPham);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
