package com.webproject.foodDelivery.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ListController {


	@RequestMapping(value="/list", method = RequestMethod.GET)
	public String login() {
		return "list";	
	}
}