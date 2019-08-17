package com.zhiyun.commerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zhiyun.commerce.client.TicketClient;

@RestController
public class TicketController {
	
    @Autowired
    private TicketClient ticketClient;

    @RequestMapping("/")
    public String index(){
        return ticketClient.buyTicket();
    }
}
