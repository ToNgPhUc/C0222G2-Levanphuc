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
    private IDictionnaryService iDictionnaryService;

    @GetMapping(value = "/convert")
    public String dictionary(@RequestParam String 日本語, Model model) {

        String str = iDictionnaryService.convert(日本語);
        if (str == null) {
            model.addAttribute("daMeDeSu", "この言葉がない");
            model.addAttribute("日本語", 日本語);
        } else {
            model.addAttribute("vietnamese", str);
            model.addAttribute("日本語", 日本語);

        }
        return "日本語";
    }
}
