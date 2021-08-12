package com.eggmari.toy.service;


import com.eggmari.toy.dto.TabakoArea;
import com.eggmari.toy.repository.TabakoRepository;
import lombok.RequiredArgsConstructor;
import org.json.simple.JSONArray;
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

    public void insertArea(double longitude,double latitude, String areaName, String areaContent, String macAddr){
        TabakoArea tabakoArea = new TabakoArea(longitude, latitude, areaName, areaContent, macAddr);

        tabakoRepository.save(tabakoArea);
    }

    public JSONArray getArea(double longitude, double latitude){
        JSONArray json = new JSONArray();
        tabakoRepository.findAllByTabakoIdxDesc().forEach(e -> json.add(e));

        return json;
    }

}
