package com.eggmari.toy.service;


import com.eggmari.toy.dto.Menu;
import com.eggmari.toy.dto.TabakoArea;
import com.eggmari.toy.repository.MenuRepository;
import com.eggmari.toy.repository.TabakoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TabakoService {

    private final TabakoRepository tabakoRepository;


    public List<TabakoArea> searchAreaList(){
        List<TabakoArea> area_list = tabakoRepository.findAll();
        return area_list;
    }

    public void insertArea(int tabakoIdx, double longitude,double latitude, String areaName, String areaContent, int reportCnt, int goodCnt, int userIdx, String macAddr){
        TabakoArea tabakoArea = new TabakoArea(tabakoIdx, longitude, latitude, areaName, areaContent, reportCnt, goodCnt, userIdx, macAddr);

        tabakoRepository.save(tabakoArea);
    }

}
