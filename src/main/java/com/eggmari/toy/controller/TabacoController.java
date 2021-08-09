package com.eggmari.toy.controller;


import com.eggmari.toy.dto.TabakoArea;
import com.eggmari.toy.service.MenuService;
import com.eggmari.toy.service.TabakoService;
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
    private final TabakoService tabakoService;

    @RequestMapping(value = "/tabako")
    public ModelAndView tabako(ModelAndView mav, HttpServletRequest req) {
        MacAdress mac = new MacAdress();


        mav.setViewName("template/template");
        req.setAttribute("CONTENT", "TabakoArea");

        return mav;

    }

    @RequestMapping(value = "/registArea")
    public void insertArea( double lat,double lang, String area_name, String area_content){
        MacAdress mac = new MacAdress();
        String macAddr = mac.getLocalMacAddress();
        System.out.println(lat);
        System.out.println(lang);
        System.out.println(area_name);
        System.out.println(area_content);
        System.out.println(macAddr);

        tabakoService.insertArea(lat, lang, area_name, area_content, macAddr);
    }



}
