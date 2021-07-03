package com.eggmari.toy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

    @RequestMapping(value = "/main")
    public ModelAndView main(){
        ModelAndView model = new ModelAndView();
        System.out.println("sadsdas");

        return model;
       // return "Web-INF/jsp/Main.jsp";
    }
}
