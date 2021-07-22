package com.eggmari.toy.controller;


import com.eggmari.toy.service.MenuService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequiredArgsConstructor
public class MenuController {
    @Autowired
    private final MenuService menuService;

    @RequestMapping(value = "/menus")
    public ModelAndView main(ModelAndView mav) {
        mav.setViewName("template/header");
        mav.addObject("menus", menuService.searchMenuList());



        return mav;

    }


}
