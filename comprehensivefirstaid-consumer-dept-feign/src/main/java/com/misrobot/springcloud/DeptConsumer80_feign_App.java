package com.misrobot.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient

//这两个注解不是特别清楚 但是加了才可以启动成功
@EnableFeignClients(basePackages= {"com.misrobot.springcloud"})
@ComponentScan("com.misrobot.springcloud")
public class DeptConsumer80_feign_App
{
	public static void main(String[] args)
	{
		SpringApplication.run(DeptConsumer80_feign_App.class, args);
	}
}
