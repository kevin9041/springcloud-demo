package com.misrobot.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServer_3344_StartSpringCloudApp
{
	public static void main(String[] args)
	{
		SpringApplication.run(ConfigServer_3344_StartSpringCloudApp.class, args);
	}
}
