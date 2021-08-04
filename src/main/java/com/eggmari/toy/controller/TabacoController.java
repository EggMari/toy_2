package com.eggmari.toy.controller;


import com.eggmari.toy.service.MenuService;
import com.eggmari.toy.util.MacAdress;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;


@Controller
@RequiredArgsConstructor
public class TabacoController {
    @Autowired
    private final MenuService menuService;

    @RequestMapping(value = "/tabako")
    public ModelAndView tabako(ModelAndView mav, HttpServletRequest req) {
        MacAdress mac = new MacAdress();

        req.setAttribute("mac", mac.getLocalMacAddress());
        mav.setViewName("template/template");
        req.setAttribute("CONTENT", "TabakoArea");

        return mav;

    }


}
