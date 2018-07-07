package com.misrobot.springcloud;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@EnableRabbit
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class Config_RabbitApplication {

    public static void main(String[] args) {
        SpringApplication.run(Config_RabbitApplication.class,args);
    }

}