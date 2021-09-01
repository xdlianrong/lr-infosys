package com.xdlr.infosys.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class RegisterController {
    Logger logger = LoggerFactory.getLogger(RegisterController.class);

    @RequestMapping("/register")
    public ModelAndView register(){
        ModelAndView  modelAndView= new ModelAndView("register");
        return modelAndView;
    }
}
