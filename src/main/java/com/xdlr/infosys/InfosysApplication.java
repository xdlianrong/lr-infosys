package com.xdlr.infosys;

import com.xdlr.infosys.member.MessageService;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.xdlr.infosys.mapper")
public class InfosysApplication {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(InfosysApplication.class);
        SpringApplication.run(InfosysApplication.class, args);
        MessageService message = new MessageService("接受信息");
        message.start();
    }
}
