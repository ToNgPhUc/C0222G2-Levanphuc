package com.phuc.quan_li_dien_thoai.controller;

import com.phuc.quan_li_dien_thoai.model.Smartphone;
import com.phuc.quan_li_dien_thoai.service.ISmartphoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@RestController
@RequestMapping("/smartphones")
@CrossOrigin
public class SmartphoneRestfulController {
    @Autowired
    private ISmartphoneService ismartphoneService;

    @GetMapping(value = "phoneList")
    public ResponseEntity<Page<Smartphone>> findAllPagePhone(
            @PageableDefault(value = 3) Pageable pageable,
            @RequestParam Optional<String> keyword) {
        String keywordVar = keyword.orElse("");

        Page<Smartphone> smartphone= this.ismartphoneService.findAllByName(keywordVar,pageable);
        if (!smartphone.hasContent()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(smartphone,HttpStatus.OK);
    }


    @PostMapping(value = "create")
    public ResponseEntity<Smartphone> saveSmartPhone(@RequestBody Smartphone smartphone) {
        return new ResponseEntity<>(ismartphoneService.save(smartphone), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Smartphone> deleteSmartPhone(@PathVariable long id) {
        Optional<Smartphone> smartPhoneOptional = ismartphoneService.findById(id);
        if (!smartPhoneOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        ismartphoneService.remove(id);
        return new ResponseEntity<>(smartPhoneOptional.get(), HttpStatus.NO_CONTENT);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Smartphone> findBlogById(@PathVariable long id) {
        Optional<Smartphone> smartPhoneOptional = ismartphoneService.findById(id);
        if (!smartPhoneOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(smartPhoneOptional.get(), HttpStatus.OK);
    }

    @PostMapping("/update")
    public ResponseEntity<Smartphone> updateSmartPhone( @RequestBody Smartphone smartphone) {
        if (ismartphoneService.findById(smartphone.getId()) == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(ismartphoneService.save(smartphone), HttpStatus.OK);
    }


//
//    @PostMapping("/update")
//    public ResponseEntity<Smartphone> updateSmartPhone(@PathVariable long id, @RequestBody Smartphone smartphone) {
//        Optional<Smartphone> smartPhoneOptional = ismartphoneService.findById(id);
//        if (!smartPhoneOptional.isPresent()) {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//        return new ResponseEntity<>(ismartphoneService.save(smartphone), HttpStatus.OK);
//    }

}
