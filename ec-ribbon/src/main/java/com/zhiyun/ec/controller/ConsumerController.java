package com.zhiyun.ec.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {
	@Autowired
    RestTemplate restTemplate;
 
    @RequestMapping(value = "/getuserinfo", method = RequestMethod.GET)
    public String add() {
        return restTemplate.getForEntity("http://www.baidu.com", String.class).getBody();
    }
}
