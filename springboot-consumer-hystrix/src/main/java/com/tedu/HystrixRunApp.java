package com.tedu;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringCloudApplication
@EnableFeignClients
public class HystrixRunApp {
	public static void main(String[] args) {
		SpringApplication.run(HystrixRunApp.class, args);
	}
}
