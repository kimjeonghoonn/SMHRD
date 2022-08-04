package com.smhrd.myapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.smhrd.myapp.domain.Member;
import com.smhrd.myapp.mapper.MemberMapper;
import com.smhrd.myapp.repo.Repo;

@org.springframework.stereotype.Service
public class Service {
	@Autowired
	 Repo repo;
	
	@Autowired
	MemberMapper mapper;
		
	public List<Member> findAll() {

		return repo.findAll();
		
	}
	
	public List<Member> findAllMB() {
		return mapper.memberList();
	}
	
	public Optional<Member> findById(String id) {
		return repo.findById(id);
	}
}
