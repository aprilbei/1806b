package com.tedu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy	//标识api网关
@EnableEurekaClient
public class ZuulAppRun {

	public static void main(String[] args) {
		SpringApplication.run(ZuulAppRun.class, args);

	}

}
