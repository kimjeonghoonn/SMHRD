package com.smhrd.myapp.controller;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.smhrd.myapp.domain.Member;
import com.smhrd.myapp.service.Service;

@RestController
public class RController {
	@Autowired
	private Service service;
	
	@RequestMapping(value = "/member", method = {RequestMethod.GET})
	public List<Member> userDataFindAll() {
		List<Member> list = service.findAll();
		return list;		
	}
	
	@RequestMapping(value = "/memberMB", method = {RequestMethod.GET})
	public List<Member> userDataFindAllMB() {
		List<Member> list = service.findAllMB();
		return list;		
	}
	
	
	@RequestMapping(value = "/member/smhrd1", method = {RequestMethod.GET})
	public Optional<Member> userDataFindSmhrd1(String id) {
		Optional<Member> list = service.findById(id);
		return list;		
	}
}
