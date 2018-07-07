package com.misrobot.springcloud;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@EnableRabbit
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class RabbitApplication {

    public static void main(String[] args) {
        SpringApplication.run(RabbitApplication.class,args);
    }

}