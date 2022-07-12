package com.phuc.validate_music.controller;

import com.phuc.validate_music.model.Music;
import com.phuc.validate_music.dto.MusicDto;
import com.phuc.validate_music.model.TypeMusic;
import com.phuc.validate_music.service.IMusicService;
import com.phuc.validate_music.service.ITypeMusicService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.Optional;

@Controller
@RequestMapping("/music")
public class MusicController {
    @Autowired
    private IMusicService iMusicService;
    @Autowired
    ITypeMusicService iTypeMusicService;

    @GetMapping(value = "")
    public String showList(Model model,
                           @PageableDefault(value = 3) Pageable pageable,
                           @RequestParam Optional<String> search) {

        String searchType = search.orElse("");

        Page<Music> musicList = this.iMusicService.findByTyMusic(searchType, pageable);
        model.addAttribute("musicList", musicList);
        model.addAttribute("searchType", searchType);
        return "/music_list";
    }

    @GetMapping(value = "create")
    public String showFormCreate(Model model) {
        model.addAttribute("typeMusicList", this.iTypeMusicService.findAll());
        model.addAttribute("musicDto", new MusicDto());
        return "/create";
    }

    @PostMapping(value = "save")
    public String createMusic(@Valid @ModelAttribute("musicDto") MusicDto musicDto,
                              BindingResult bindingResult,
                              RedirectAttributes redirectAttributes, Model model, Music music) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("typeMusicList", this.iTypeMusicService.findAll());
            return "create";
        } else {
//            Music music = new Music(); dùng để regex còn music ở line
//            (   RedirectAttributes redirectAttributes, Model model, Music music) ) thì dùng để thêm mới
            BeanUtils.copyProperties(musicDto, music);
            this.iMusicService.save(music);
            redirectAttributes.addFlashAttribute("success", "Register success!");
        }
        return "redirect:/music";
    }

    @GetMapping("/{id}/view")
    public String view(@PathVariable int id, Model model) {
        model.addAttribute("music", iMusicService.findByIdMusic(id));
        return "view";
    }

}
