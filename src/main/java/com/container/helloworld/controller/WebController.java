package com.container.helloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController{
	
	@RequestMapping("/")
	public String home() {
		return "Hello Docker World";
	}

}