package com.eggmari.toy.controller;


import com.eggmari.toy.service.MenuService;
import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequiredArgsConstructor
public class TextHandlingController {

    @Autowired
    private final MenuService menuService;

    @RequestMapping(value = "/TextHandling")
    public ModelAndView main(ModelAndView mav, HttpServletRequest req) throws JsonProcessingException {
        mav.setViewName("template/template");
        req.setAttribute("CONTENT", "TextHandling");
        mav.addObject("menus", menuService.searchMenuList());



        return mav;

    }
}
