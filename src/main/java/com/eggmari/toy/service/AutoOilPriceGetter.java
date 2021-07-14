package com.eggmari.toy.service;


import lombok.RequiredArgsConstructor;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.Date;

@RequiredArgsConstructor
@EnableScheduling
@SpringBootApplication
public class AutoOilPriceGetter {
    @Autowired
    private  OilPriceService oilPriceService;

    @Scheduled(cron = "0 0 5 * * *")
    public void AutoOilGetter() throws ParseException {
        Date date = new Date();
        System.out.println("일배치 돌아감"+date);
       JSONObject json = oilPriceService.getOilPrice();
       oilPriceService.savePrices(json);
    }


}
