package com.zhiyun.commerce.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="TICKET-PROVIDER")
public interface TicketClient {

	@RequestMapping(value = "/hello")
    public String hello(@RequestParam(value = "name") String name);
	
	@GetMapping(value="/buyTicket")
	public String buyTicket();
	
}
