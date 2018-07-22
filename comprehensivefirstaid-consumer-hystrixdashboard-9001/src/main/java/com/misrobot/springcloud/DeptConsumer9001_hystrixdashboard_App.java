package com.misrobot.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
//Loading...是一直在等待负载均衡的提供方要去消费服务，即访问负载均衡服务器，去调用客户端，如果有数据响应则监控界面就会有图形数据展示：如果想让图中的数据发生变化，则需要循环多次的去访问负载均衡的提供方，让其消费服务，以至于达到监控的目的。
public class DeptConsumer9001_hystrixdashboard_App
{
	public static void main(String[] args)
	{
		SpringApplication.run(DeptConsumer9001_hystrixdashboard_App.class, args);
	}
}
