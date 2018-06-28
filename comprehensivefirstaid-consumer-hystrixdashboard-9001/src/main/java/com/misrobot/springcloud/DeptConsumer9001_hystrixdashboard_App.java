package com.misrobot.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class DeptConsumer9001_hystrixdashboard_App
{
	public static void main(String[] args)
	{
		SpringApplication.run(DeptConsumer9001_hystrixdashboard_App.class, args);
	}
}
