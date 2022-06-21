package com.phuc.controller;


import com.phuc.model.Music;
import com.phuc.service.IMusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "music")
public class MusicController {
    @Autowired
    private IMusicService iMusicService;

    @GetMapping(value = "")
    public String showFormList(Model model) {
        List<Music> musicList = iMusicService.getAll();
        model.addAttribute("musicList", musicList);
        return "list_music";
    }

    @GetMapping(value = "create")
    public String showFormCreate(Model model) {
        model.addAttribute("music", new Music());
        return "create";
    }

    @PostMapping(value = "save")
    public String create(@ModelAttribute Music music) {
        iMusicService.save(music);
        return "redirect:/music";
    }

    @GetMapping(value = "/{idMusic}/edit")
    public String showFormEdit(@PathVariable int idMusic, Model model ){
        model.addAttribute("music",iMusicService.findById(idMusic));
        return "/edit";
    }
    @PostMapping(value = "/edit")
    public String edit( @ModelAttribute Music music){
        iMusicService.edit(music);
        return "redirect:/music";
    }
    @GetMapping(value = "/{idMusic}/delete")
    public String showFormDelete( @PathVariable int idMusic, Model model){
        model.addAttribute("music",iMusicService.findById(idMusic));
        return "/delete";
    }

    @PostMapping(value = "/delete")
    public String deleteProduct( @ModelAttribute Music music){
        iMusicService.delete(music.getIdMusic());
        return "redirect:/music";
    }


}
