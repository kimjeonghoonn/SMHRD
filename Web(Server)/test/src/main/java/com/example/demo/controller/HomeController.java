package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.service.BoardService;
import com.example.demo.service.UserService;

@Controller
public class HomeController {

	private UserService uService;
	
	public HomeController(UserService u) {

		this.uService=u;
	}
	@RequestMapping("/")
	public String home(Model model) {
		return "Home";
	}
}