package com.tedu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.tedu.feign.HelloFeign;

@RestController
public class HelloController {
	@Autowired
	private HelloFeign helloFeign;

	@RequestMapping("/hello/{name}")
	@HystrixCommand(fallbackMethod="helloFallback")
	public String hello(@PathVariable String name){
		return helloFeign.hello(name);
	}
	
	//hystrix不够完美，第一次可能进到这里(第一次业务启动慢，超过阈值）：如果业顺畅执行，这个现象就不会了
	public String helloFallback(String name){
		return "tony";
	}
	
	
}
