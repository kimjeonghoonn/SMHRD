package com.smhrd.myapp.mapper;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Component;

import com.smhrd.myapp.domain.Member;


@MapperScan
public interface MemberMapper {

	public List<Member> memberList();
}
