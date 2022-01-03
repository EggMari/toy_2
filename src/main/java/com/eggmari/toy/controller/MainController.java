package com.eggmari.toy.controller;

import com.eggmari.toy.service.MenuService;
import com.eggmari.toy.util.Crypto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequiredArgsConstructor
public class MainController {
    @Autowired
    private final MenuService menuService;
    
    @RequestMapping(value = "/main")
    public ModelAndView main(HttpServletRequest req) throws Exception {
        ModelAndView mav = new ModelAndView("template/template");
        req.setAttribute("CONTENT", "Main");

        return mav;
    }

}
