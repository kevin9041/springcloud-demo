package com.misrobot.springcloud.senders;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Sender {

    @Autowired
    AmqpTemplate amqpTemplate;

    public void send(){
        String content="Hello "+new Date().toLocaleString();
        System.out.println("Sender : "+content);
        this.amqpTemplate.convertAndSend("test",content);
    }
}