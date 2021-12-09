package com.xdlr.infosys.service;

import com.xdlr.infosys.model.LeaveInfo;
import com.xdlr.infosys.repo.LeaveInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LeaveService {
    @Autowired
    LeaveInfoRepository leaveInfoRepository;

    public Boolean addInfo(String leaveType, String startDate,
                           String startTime, String endData,
                           String endTime, String reason){
        /**
         * TODO 根据请假日期添加功能
         */
        /**
         * TODO参数问题
         */

        LeaveInfo info = new LeaveInfo();
        LeaveInfo save = leaveInfoRepository.save(info);


        if(save == null) return false;
        return true;
    }
}
