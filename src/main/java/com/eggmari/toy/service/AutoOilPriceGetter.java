package com.eggmari.toy.service;


import org.springframework.scheduling.annotation.Scheduled;


public class AutoOilPriceGetter {

    @Scheduled(cron = "0 0 5 * * *")
    public void AutoOilGetter(){
        OilPriceService oilPriceService = new OilPriceService();

    }


}
