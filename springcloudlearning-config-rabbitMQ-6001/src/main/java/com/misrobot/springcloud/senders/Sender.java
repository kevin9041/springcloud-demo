package com.misrobot.springcloud.senders;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Sender {

    @Autowired
    AmqpTemplate amqpTemplate;

    @Autowired
    RabbitTemplate rabbitTemplate;

    public void amqpTemplateSend(){
        String content="Hello "+new Date().toLocaleString();
        System.out.println("Sender : "+content);
        this.amqpTemplate.convertAndSend("test",content);
    }

    public void rabbitTemplateSend(){
        String content="Hello "+new Date().toLocaleString();
        System.out.println("Sender : "+content);
        this.rabbitTemplate.convertAndSend("test",content);
    }
}