package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class appController {
	
	@GetMapping("/")
	public String home() {
		return "home";
	}
	
	@GetMapping("/profile")
	public String profile() {
		return "profile";
	}
	@GetMapping("/log")
	public String login() {
		return "form";
	}

}
