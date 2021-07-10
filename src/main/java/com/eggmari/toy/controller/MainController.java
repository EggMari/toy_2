package com.eggmari.toy.controller;

import com.eggmari.toy.util.Crypto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {
    
    
    @RequestMapping(value = "/main")
    public ModelAndView main(HttpServletRequest req) throws Exception {
        ModelAndView mav = new ModelAndView("template/template");
        req.setAttribute("CONTENT", "Main");

        return mav;
    }



}
