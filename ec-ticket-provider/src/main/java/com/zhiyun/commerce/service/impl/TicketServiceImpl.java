package com.zhiyun.commerce.service.impl;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zhiyun.commerce.service.TicketService;

@Component
@RestController
public class TicketServiceImpl implements TicketService {

	@Override
	@RequestMapping("buyTicket")
	public String buyTicket() {
		return "《死亡笔记2》";
	}

}
