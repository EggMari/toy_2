package com.eggmari.toy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class OilPriceController {
    
    
    @RequestMapping(value = "/OilPrice")
    public ModelAndView main(){
        ModelAndView mav = new ModelAndView("OilPrice");
        System.out.println("왜안돼");
        return mav;
    }


    
}
