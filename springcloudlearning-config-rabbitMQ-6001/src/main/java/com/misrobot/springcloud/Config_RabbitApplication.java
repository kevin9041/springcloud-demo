package com.misrobot.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@EnableDiscoveryClient
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
//@RefreshScope              ----------------->加载这里没有用 只能加在需要刷新的地方才可以 如${foo}
//http://localhost:6001/bus/refresh
public class Config_RabbitApplication {

    public static void main(String[] args) {
        SpringApplication.run(Config_RabbitApplication.class,args);
    }

}