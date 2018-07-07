package com.misrobot.springcloud.controller;

import com.misrobot.springcloud.senders.Sender;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

    @RequestMapping(value = "/rabbitMQ/test/{message}",method = RequestMethod.GET)
    public void testRabbitMQ(@PathVariable("message") String message){
        Sender sender=new Sender();
        sender.send();
    }
}