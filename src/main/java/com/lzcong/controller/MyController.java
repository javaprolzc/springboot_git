package com.lzcong.controller;

import com.lzcong.domain.TbHero;
import com.lzcong.service.HeroService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@Slf4j
public class MyController {

    @Autowired
    private HeroService heroService;

    @RequestMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("name", "lzc");
        TbHero hero = new TbHero();
        hero.setUsername("lzc");
        hero.setId(1);
        model.addAttribute("hero", hero);
        return "myHello";
    }

    @ResponseBody
    @RequestMapping("/git")
    public String git(){
        return "hello github";
    }

    //开发人员写了一句话
}
