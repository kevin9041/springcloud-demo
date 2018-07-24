package com.misrobot.springcloud.config;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

    @Bean
    public Queue testQueue(){
        return new Queue("test");
    }

    @Bean
    public AmqpTemplate rabbitTemplate(){
        return new RabbitTemplate();
    }

}