package com.misrobot.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigClientRest
{

	@Value("${foo}")
	private String foo;

	@RequestMapping("/config")
	public String getConfig()
	{
		String str = "foo: " + foo ;
		System.out.println("******str: " + str);
		return str;
	}
}
