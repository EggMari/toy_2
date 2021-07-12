package com.eggmari.toy.service;


import lombok.RequiredArgsConstructor;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;

@RequiredArgsConstructor
public class AutoOilPriceGetter {
    @Autowired
    private  OilPriceService oilPriceService;

    @Scheduled(cron = "0 0 5 * * *")
    public void AutoOilGetter() throws ParseException {
       JSONObject json = oilPriceService.getOilPrice();
       oilPriceService.savePrices(json);
    }


}
