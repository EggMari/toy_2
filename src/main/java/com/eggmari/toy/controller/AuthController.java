package com.eggmari.toy.controller;

import com.eggmari.toy.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

@Controller
@RequiredArgsConstructor
public class AuthController {

    @Autowired
    public AuthService authService;

    @RequestMapping(value = "/signforeggmari")
    public void main(String id, String pwd) throws GeneralSecurityException, UnsupportedEncodingException {
       authService.InsertUser(id, pwd);

    }
    @RequestMapping(value = "/joinToy")
    public ModelAndView joinToy(HttpServletRequest req) {
        ModelAndView mav = new ModelAndView("template/template");
        req.setAttribute("CONTENT", "JoinToy");

        return mav;
    }



}
