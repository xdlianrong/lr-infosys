package com.xdlr.infosys.register;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RegisterController {
    Logger logger = LoggerFactory.getLogger(RegisterService.class);
    @Autowired
    RegisterService registerService;

    @RequestMapping("/registerNewEmployee")
    public String registerNewEmployee(@RequestParam String name, @RequestParam String sex,
                                      @RequestParam String phone, @RequestParam String idCardNumber,
                                      @RequestParam String department, @RequestParam String position,
                                      @RequestParam String job, @RequestParam String entryTime){
        if(registerService.registerNewEmployee(name, sex, phone, idCardNumber, department, position, job, entryTime)){
            logger.debug("Add new employee successfully");
            return "index";
        }else{
            logger.debug("there're some errors when add new employee");
            return "error";
        }
    }

    @RequestMapping("/register")
    public String register(){
        return "register";
    }
}
