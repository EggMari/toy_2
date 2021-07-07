package com.eggmari.toy.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {
    
    
    @RequestMapping(value = "/main", method = RequestMethod.GET)
    public ModelAndView main(){
        ModelAndView mav = new ModelAndView("Main");
        mav.addObject("name", "오브젝트");
        List<String> testList = new ArrayList<>();
        testList.add("왜안된데");

        testList.add("안");

        testList.add("돼");
        mav.addObject("list", testList);
        System.out.println("왜안돼");
        return mav;
    }



}
