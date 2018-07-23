package com.misrobot.springcloud.controller;

import com.misrobot.springcloud.entities.Dept;
import com.misrobot.springcloud.service.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeptCon
{
	@Autowired
	private DeptService service;

	@HystrixCommand(fallbackMethod = "processHystrix_Get")
	@RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
	public Dept get(@PathVariable("id") Long id)
	{
		Dept dept=service.get(id);
		if(dept==null){
			throw new RuntimeException();
		}
		return dept;
	}


	public Dept processHystrix_Get(@PathVariable("id") Long id){
		return new Dept(id,"------","------");
	}

}
