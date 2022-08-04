package com.reacttest.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.reacttest.domain.User;

@RestController
public class UserApiController {
	
	@PostMapping("/api/users")
	public User user() {
		System.out.println("UserApiController start...");
		User user = new User(1, "김정훈", "비밀번호", "jhun6241@daum.net");
		return user;
	}
	
	@PostMapping("/api/usersSave")
	public String userSave(@RequestBody User user) {
		System.out.println(">>>> UserSave Request");
		System.out.println(">>>> param : " + user.toString());
		
		return "success";
	}

}
