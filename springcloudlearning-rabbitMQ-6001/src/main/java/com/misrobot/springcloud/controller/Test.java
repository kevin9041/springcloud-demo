package com.misrobot.springcloud.controller;

import com.misrobot.springcloud.senders.Sender;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class Test {

    @Value("${foo:555}")
    private String foo;

    @RequestMapping(value = "/getFoo")
    public String getFoo(){
        return foo;
    }

    @RequestMapping(value = "/rabbitMQ/test/{message}",method = RequestMethod.GET)
    public void testRabbitMQ(@PathVariable("message") String message){
        Sender sender=new Sender();
        sender.send();
    }
}