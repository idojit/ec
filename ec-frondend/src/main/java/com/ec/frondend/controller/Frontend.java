package com.ec.frondend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@EnableAutoConfiguration
@RestController
@CrossOrigin // So that javascript can be hosted elsewhere
public class Frontend {
	@Autowired
	RestTemplate restTemplate;

	@RequestMapping("/")
	public String callBackend() {
		//restTemplate.getForEntity(url, responseType, uriVariables);
		return restTemplate.getForObject("http://localhost:9000/api", String.class);
	}

	

}
