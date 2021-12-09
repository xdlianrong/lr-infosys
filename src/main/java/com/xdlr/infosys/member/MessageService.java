package com.xdlr.infosys.member;

import com.xdlr.infosys.config.ApplicationContextProvider;
import com.xdlr.infosys.model.LeaveInfo;
import com.xdlr.infosys.repo.LeaveInfoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * @author starsdeliever
 * @NOTICE 如果没有看懂这一个类文件，不建议对其进行修改
 */
//@Service
public class MessageService implements Runnable{
    LeaveInfoRepository leaveInfoRepository = ApplicationContextProvider.getBean(LeaveInfoRepository.class);
    Logger logger = LoggerFactory.getLogger(MessageService.class);
    private Thread t;
    private String threadName;

    public MessageService() {
    }

    public MessageService(String name) {
        threadName = name;
    }
    @Override
    public void run(){
        while(true){
            List<LeaveInfo> list = leaveInfoRepository.findByReaded(false);
            for(int i = 0;i < list.size();i++){

            }
        }
    }
    public void start(){
        if(t == null){
            t = new Thread(this,threadName);
            t.start();
        }
    }
}
