package com.phuc.validate_form_dang_ki.controller;


import com.phuc.validate_form_dang_ki.model.User;
import com.phuc.validate_form_dang_ki.model.UserDto;
import com.phuc.validate_form_dang_ki.service.IUserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService iUserService;
    @GetMapping(value = "")
    public String showList(Model model){
        model.addAttribute("userList",iUserService.findAll());

        return "user_list";
    }

    @GetMapping("create")
    public String showCreateAndRegex(Model model) {
        model.addAttribute("userDto", new UserDto());
        return "create";
    }

    @PostMapping("/save")
    public String createAndRegex(@Valid @ModelAttribute("userDto") UserDto userDto,
                                 BindingResult bindingResult,
                                 RedirectAttributes redirectAttributes) {
        if (bindingResult.hasErrors()) {
            return "create";
        } else {
            User user = new User();
            BeanUtils.copyProperties(userDto, user);
            this.iUserService.save(user);
            redirectAttributes.addFlashAttribute("success","Register success!");
            return "redirect:/user/";
        }
    }
}