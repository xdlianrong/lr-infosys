package com.xdlr.infosys.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController(value = "/api/v0")
public class ProcessController {
    @RequestMapping(value = "/process")
    public ModelAndView process(){
        return new ModelAndView("leave_approval");
    }

    @RequestMapping(value = "/leave_process/{result}")
    public void leaveProcess(@PathVariable(value = "result") String result){
        if ("agree".equals(result)){

        }else {

        }
        return ;
    }
}
