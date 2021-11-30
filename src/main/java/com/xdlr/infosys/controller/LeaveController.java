package com.xdlr.infosys.controller;

import com.xdlr.infosys.member.MessageService;
import com.xdlr.infosys.model.LeaveInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
public class LeaveController {
    @Autowired
//    MessageService messageService;
    @RequestMapping(value = "/leave")
    public ModelAndView leaveRequest(){return new ModelAndView("ask_for_leave");}
    @RequestMapping(value = "/leave_apply/{leaveType}/{startDate}/{startTime}/{endDate}/{endTime}/{reason}")
    public ModelAndView leaveApply(@PathVariable(value = "leaveType")String leaveType,
                                   @PathVariable(value = "startData") String startDate,
                                   @PathVariable(value = "startTime")String startTime,
                                   @PathVariable(value = "endData")String endData,
                                   @PathVariable(value = "endTime")String endTime,
                                   @PathVariable(value = "reason")String reason){

        LeaveInfo leaveInfo=new LeaveInfo();

        return  null;
    }
}

