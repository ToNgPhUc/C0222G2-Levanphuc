package com.phuc.dem_so_luot_view_trang.controller;

import com.phuc.dem_so_luot_view_trang.model.Counter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("counter")
public class CounterController {

    @ModelAttribute("counter")
    public Counter setUpCounter() {
        return new Counter();
    }

    @GetMapping("/counter")
    public String get(@ModelAttribute("counter") Counter counter) {
        counter.increment();
        return "/index";
    }

    @GetMapping(value = "nhan")
    public String get1(@ModelAttribute ("counter") Counter counter){
        counter.nhan();
        return "index";
    }
}
