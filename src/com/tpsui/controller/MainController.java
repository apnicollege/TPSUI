package com.tpsui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("/")
	public String showHome() {
		return "index";
	}
	
	@RequestMapping("/ticket")
	public String showTicket() {
		return "ticket";
	}
}

//WEB-INF/jsps/<name>.jsp