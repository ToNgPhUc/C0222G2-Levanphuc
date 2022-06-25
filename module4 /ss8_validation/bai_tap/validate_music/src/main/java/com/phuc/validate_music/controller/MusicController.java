package com.phuc.validate_music.controller;

import com.phuc.validate_music.model.Music;
import com.phuc.validate_music.model.MusicDto;
import com.phuc.validate_music.service.IMusicService;
import com.sun.tracing.dtrace.Attributes;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
@RequestMapping("/music")
public class MusicController {
    @Autowired
    private IMusicService iMusicService;
    @GetMapping(value = "")
    public String showList(Model model){
        model.addAttribute("musicList",iMusicService.findAll());
        return "/music_list";
    }
    @GetMapping(value = "create")
    public String showFormCreate(Model model){
        model.addAttribute("musicDto",new MusicDto());
        return "/create";
    }
    @PostMapping(value = "save")
    public String createMusic(@Valid @ModelAttribute ("musicDto") MusicDto musicDto,
                              BindingResult bindingResult,
                              RedirectAttributes redirectAttributes){
        if (bindingResult.hasErrors()){
            return "/create";
        }
        else {
            Music music= new Music();
            BeanUtils.copyProperties(musicDto,music);
            this.iMusicService.save(music);
            redirectAttributes.addFlashAttribute("success","Register success!");
        }
        return "redirect:/music";
    }
    @GetMapping("/{id}/view")
    public String view(@PathVariable int id, Model model) {
        model.addAttribute("music", iMusicService.findByIdMusic(id));
        return "view";
    }

}
