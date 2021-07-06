package com.eggmari.toy.service;


import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;

@RequiredArgsConstructor
public class AutoOilPriceGetter {
    //private final OilPriceService oilPriceService;

    @Scheduled(cron = "0 0 5 * * *")
    public void AutoOilGetter(){


    }


}
