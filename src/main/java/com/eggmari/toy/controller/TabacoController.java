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

    @RequestMapping(value = "/inputTabako")
    public void insertArea(int tabakoIdx, double longitude,double latitude, String areaName, String areaContent, int reportCnt, int goodCnt, int userIdx){
        MacAdress mac = new MacAdress();
        String macAddr = mac.getLocalMacAddress();
        tabakoService.insertArea(tabakoIdx, longitude, latitude, areaName, areaContent, reportCnt, goodCnt, userIdx, macAddr);


    }



}
