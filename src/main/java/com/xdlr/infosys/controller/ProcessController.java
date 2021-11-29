package com.xdlr.infosys.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class ProcessController {

    Logger logger = LoggerFactory.getLogger(ProcessController.class);

    @RequestMapping(value = "/leave_process/{result}")
    public void leaveProcess(@PathVariable(value = "result") String result){
        if ("agree".equals(result)){
            logger.debug("同意请假");

        }else {

        }
        return ;
    }
}
