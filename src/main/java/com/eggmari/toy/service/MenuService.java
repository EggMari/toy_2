package com.eggmari.toy.service;


import com.eggmari.toy.dto.Menu;
import com.eggmari.toy.repository.MenuRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MenuService {


    private final MenuRepository menuRepository;

    public List<Menu> searchMenuList(){
        List<Menu> menu_list = menuRepository.findAll();
        return menu_list;
    }



}
