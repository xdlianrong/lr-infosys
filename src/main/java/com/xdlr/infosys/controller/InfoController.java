package com.xdlr.infosys.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class InfoController {

    @RequestMapping("/contract")
    public ModelAndView contrast() { return new ModelAndView("contract"); }

    @RequestMapping("/patent")
    public ModelAndView patent() { return new ModelAndView("patent"); }
}
