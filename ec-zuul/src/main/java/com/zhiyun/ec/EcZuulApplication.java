package com.zhiyun.ec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class EcZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcZuulApplication.class, args);
	}

}
