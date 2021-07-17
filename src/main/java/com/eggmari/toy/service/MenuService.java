package com.eggmari.toy.service;


import com.eggmari.toy.dto.Menu;
import com.eggmari.toy.dto.OilPrice;
import com.eggmari.toy.repository.MenuRepository;
import com.eggmari.toy.repository.OilPriceRepository;
import lombok.RequiredArgsConstructor;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MenuService {


    private final MenuRepository menuRepository;

    public List<Menu> searchMenuList(){
        List<Menu> menu_list = menuRepository.findMenus();
        return menu_list;
    }



}
