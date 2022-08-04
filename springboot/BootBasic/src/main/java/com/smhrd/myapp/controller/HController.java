package com.smhrd.myapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HController {
	@RequestMapping(value="/home") 
	public String hello() { 
		return "main"; 
	}
}
