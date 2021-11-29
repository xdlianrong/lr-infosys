package com.xdlr.infosys.controller;

import com.xdlr.infosys.member.MemberService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class LoginController {
    @Autowired
    MemberService memberService;

    Logger logger = LoggerFactory.getLogger(LoginController.class);

    @RequestMapping("/login")
    public ModelAndView login(){
        return new ModelAndView("login");
    }


    @PostMapping("/login")
    public Boolean login(@RequestParam Long id, @RequestParam String password){
        if(memberService.login(id, password)){
            return true;
        }
        return false;
    }
}
