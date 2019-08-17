package com.zhiyun.ec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EcSleuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcSleuthApplication.class, args);
	}

}
