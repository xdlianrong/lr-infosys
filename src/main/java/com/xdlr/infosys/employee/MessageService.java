package com.xdlr.infosys.employee;

import com.xdlr.infosys.config.ApplicationContextProvider;
import com.xdlr.infosys.model.Message;
import com.xdlr.infosys.repo.MessageRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class MessageService implements Runnable{
    MessageRepository messageRepository = ApplicationContextProvider.getBean(MessageRepository.class);
    Logger logger = LoggerFactory.getLogger(MessageService.class);
    private Thread t;
    private String threadName;

    public MessageService(String name) {
        threadName = name;
    }
    @Override
    public void run(){
        while(true){
            List<Message> list = messageRepository.findByReaded(false);
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
