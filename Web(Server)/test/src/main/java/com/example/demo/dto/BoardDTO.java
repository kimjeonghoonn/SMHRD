package com.example.demo.dto;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data // 기본 메서드(Getter/Setter/toString) 생성
@AllArgsConstructor // 모든 필드를 요소로 갖는 생성자생성
@NoArgsConstructor // 기본생성자
@RequiredArgsConstructor // 필요한 필드만 요소로 갖는 생성자 생성
public class BoardDTO {
	
	// 약속1. VO의 필드(변수) 이름 == Table의 컬럼명
	// 약속2. 반드시 기본생성자는 있어야한다.
	
	// 글번호
	@NonNull
	private int b_number;
	// 제목
	@NonNull
	private String b_title;
	// 내용
	@NonNull
	private String b_content;
	// 작성자
	@NonNull
	private String b_writer;
	
	// 작성일
	private Date b_date;
	// 첨부파일
	private String b_file;
	
	
	
	public int getB_number() {
		return b_number;
	}
	public void setB_number(int b_number) {
		this.b_number = b_number;
	}
	public String getB_title() {
		return b_title;
	}
	public void setB_title(String b_title) {
		this.b_title = b_title;
	}
	public String getB_content() {
		return b_content;
	}
	public void setB_content(String b_content) {
		this.b_content = b_content;
	}
	public String getB_writer() {
		return b_writer;
	}
	public void setB_writer(String b_writer) {
		this.b_writer = b_writer;
	}
	public Date getB_date() {
		return b_date;
	}
	public void setB_date(Date b_date) {
		this.b_date = b_date;
	}
	public String getB_file() {
		return b_file;
	}
	public void setB_file(String b_file) {
		this.b_file = b_file;
	}
	
	
	
}
