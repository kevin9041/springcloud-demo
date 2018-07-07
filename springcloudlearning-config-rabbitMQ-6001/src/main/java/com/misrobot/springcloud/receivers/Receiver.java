package com.misrobot.springcloud.receivers;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "test")
public class Receiver {

    @RabbitHandler
    public void receive(String receivedStr){
        System.out.println("Receiver : "+receivedStr);
    }
}