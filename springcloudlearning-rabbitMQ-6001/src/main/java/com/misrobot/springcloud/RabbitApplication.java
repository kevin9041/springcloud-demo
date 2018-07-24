package com.misrobot.springcloud;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@EnableRabbit
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class RabbitApplication {

    @Autowired
    static AmqpTemplate rabbitTemplate;

    public static void main(String[] args) {
        SpringApplication.run(RabbitApplication.class,args);

        System.out.println(rabbitTemplate);
    }

}