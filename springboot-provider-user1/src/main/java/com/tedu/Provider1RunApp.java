package com.tedu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Provider1RunApp {
	public static void main(String[] args) {
		SpringApplication.run(Provider1RunApp.class, args);
	}

}
