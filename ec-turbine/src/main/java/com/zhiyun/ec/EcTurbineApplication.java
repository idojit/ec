package com.zhiyun.ec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@SpringBootApplication
@EnableTurbine
//@EnableTurbineStream
@EnableDiscoveryClient
public class EcTurbineApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcTurbineApplication.class, args);
	}

}
