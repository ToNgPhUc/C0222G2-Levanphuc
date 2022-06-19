package com.phuc.controller;

import com.phuc.model.Music;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UpdateMusicController {
    @GetMapping(value = "/form")
    public String showForm(Model model) {
        model.addAttribute("music", new Music());
        return "music_list";
    }

    @PostMapping(value = "save")
    public String showList(Music music, Model model) {
        model.addAttribute("nameMusic", music.getNameMusic());
        model.addAttribute("singer", music.getSinger());
        model.addAttribute("kindOfMusic", music.getKindOfMusic());
        model.addAttribute("filePath", music.getFilePath());
        return "result";
    }

}
