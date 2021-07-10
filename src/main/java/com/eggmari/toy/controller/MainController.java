package com.eggmari.toy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {
    
    
    @RequestMapping(value = "/main")
    public ModelAndView main(HttpServletRequest req){
        ModelAndView mav = new ModelAndView("template/template");
        req.setAttribute("CONTENT", "/WEB-INF/jsp/Main.jsp");
        return mav;
    }



}
