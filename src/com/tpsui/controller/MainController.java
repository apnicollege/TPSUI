package com.tpsui.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tpsui.beans.Ticket;
import com.tpsui.service.TicketService;

@Controller
public class MainController {

	@Autowired
	private TicketService ticketService;
	
	@RequestMapping("/")
	public String showHome() {
		return "index";
	}
	
	@RequestMapping("/ticket")
	public String showTicket() {
		//fetch data from service 
		List<Ticket> list = this.ticketService.getAllTickets();
		for(Ticket t : list) {
			System.out.println(t);
		}
		return "ticket";
	}
}

//WEB-INF/jsps/<name>.jsp