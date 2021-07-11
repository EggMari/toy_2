package com.eggmari.toy.controller;

import com.eggmari.toy.service.OilPriceService;
import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.RequiredArgsConstructor;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;


@Controller
@RequiredArgsConstructor
public class OilPriceController {

    @Autowired
    private final OilPriceService oilPriceService;

    @ResponseBody
    @RequestMapping(value = "/oilbutton")
    public JSONObject button() throws ParseException {

        JSONObject oilPrices = oilPriceService.getOilPrice();
        oilPriceService.savePrices(oilPrices);
        return oilPrices;
    }

    @ResponseBody
    @RequestMapping("/getOilPrices")
    public JSONArray getoilPriceByTermAndArea(String area, String term){

        return oilPriceService.searchOilPriceForArea(area, term);
    }

    @RequestMapping(value = "/OilPrice")
    public ModelAndView main(ModelAndView mav, HttpServletRequest req) throws JsonProcessingException {
        mav.setViewName("template/template");
        req.setAttribute("CONTENT", "OilPrice");

        mav.addObject("area_list", oilPriceService.searchOilPriceList());


        return mav;

    }


}
