package com.tpsui.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.tpsui.beans.Ticket;

@Service
public class TicketService {
	 
	
	public List<Ticket> getAllTickets() {
		// Call the api to fetch all tickets 
		String url="http://localhost:8787/tickets";
		 RestTemplate restTemplate = new RestTemplate();
 		Ticket[] ticketArry= restTemplate.getForObject(url, Ticket[].class);
 		List<Ticket> list = Arrays.stream(ticketArry).collect(Collectors.toList());
		return list;
	}

}
