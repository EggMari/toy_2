package com.eggmari.toy.controller;

import com.eggmari.toy.dto.ToyUser;
import com.eggmari.toy.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.apache.http.cookie.Cookie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;
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

    @RequestMapping(value = "/logInToy")
    public ModelAndView logInToy(HttpSession session, HttpServletRequest req) throws GeneralSecurityException, UnsupportedEncodingException {
        ModelAndView mav = new ModelAndView("template/template");
        String userid = req.getParameter("userid");
        String userpwd = req.getParameter("userpwd");

        String returnUrl =  req.getHeader("referer");
        returnUrl = returnUrl.substring(returnUrl.lastIndexOf("/"));
        String toyUser =  authService.logInToy(userid, userpwd);
        req.setAttribute("CONTENT", returnUrl);
        session.setAttribute("toyUserId", toyUser.substring(1));

        return mav;
    }

    @RequestMapping(value = "/logoutToy")
    public ModelAndView logoutToy(HttpSession session, HttpServletRequest req) throws GeneralSecurityException, UnsupportedEncodingException {
        ModelAndView mav = new ModelAndView("template/template");
        session.removeAttribute("toyUserId");


        req.setAttribute("CONTENT", "Main");


        return mav;
    }



}
