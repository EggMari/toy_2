package com.eggmari.toy.controller;

import com.eggmari.toy.service.OilPriceService;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class OilPriceController {

    @ResponseBody
    @RequestMapping(value = "/oilbutton")
    public JSONObject button() throws ParseException {
        OilPriceService oilPriceService = new OilPriceService();
        return oilPriceService.getOilPrice();
    }

    @RequestMapping(value = "/OilPrice")
    public ModelAndView main() {
        ModelAndView mav = new ModelAndView("OilPrice");


        return mav;

    }
}
