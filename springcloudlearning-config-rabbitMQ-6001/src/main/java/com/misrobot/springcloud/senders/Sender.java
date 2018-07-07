package com.misrobot.springcloud.senders;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Sender {

    //@Autowired
    //AmqpTemplate rabbitTemplate;

    public void send(){
        RabbitTemplate rabbitTemplate=new RabbitTemplate();
        String content="Hello "+new Date().toLocaleString();
        System.out.println("Sender : "+content);
        //this.rabbitTemplate.convertAndSend("test",content);
        rabbitTemplate.convertAndSend("test",content);
    }
}