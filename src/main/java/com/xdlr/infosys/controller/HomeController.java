package com.xdlr.infosys.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HomeController {

    @RequestMapping("/index")
    public ModelAndView index(){
        return new ModelAndView("index");
    }

    @RequestMapping("/home")
    public ModelAndView home(){
        return new ModelAndView("home");
    }

    @RequestMapping("/askForLeave")
    public ModelAndView askForLeave(){
        return new ModelAndView("ask_for_leave");
    }

    @RequestMapping(value = "/process")
    public ModelAndView process(){
        return new ModelAndView("leave_approval");
    }

    @RequestMapping("/info")
    public ModelAndView info() { return new ModelAndView("info"); }
}
