package com.phuc.controller;

import com.phuc.service.IDictionnaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DictionaryController {
    @Autowired
    IDictionnaryService iDictionnaryService;
    @GetMapping(value = "/convert")
    public String dictionary(@RequestParam String 日本語, Model model){

String value = iDictionnaryService.convert(日本語);
if (value==null){
    model.addAttribute("not","không có trong từ điển");
}else {
    model.addAttribute("vietnamese",value);
    model.addAttribute("日本語",日本語);

}
        return "/日本語";
    }
}
