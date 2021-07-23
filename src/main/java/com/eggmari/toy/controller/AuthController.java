package com.eggmari.toy.controller;

import com.eggmari.toy.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
public class AuthController {

    @Autowired
    public AuthService authService;

    @RequestMapping(value = "/signforeggmari")
    public int main(String id, String pwd)  {
        int a = authService.InsertUser(id, pwd);

        return a;
    }

}
