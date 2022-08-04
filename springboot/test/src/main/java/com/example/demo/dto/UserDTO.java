package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data // 기본 메서드(Getter/Setter/toString) 생성
@AllArgsConstructor // 모든 필드를 요소로 갖는 생성자생성
@NoArgsConstructor // 기본생성자
@RequiredArgsConstructor // 필요한 필드만 요소로 갖는 생성자 생성
public class UserDTO {
	
	// 약속1. VO의 필드(변수) 이름 == Table의 컬럼명
	// 약속2. 반드시 기본생성자는 있어야한다.
	
	// 회원 아이디
	@NonNull
	private String mem_id;
	// 회원 비밀번호
	@NonNull
	private String mem_password;
	// 회원 이름
	@NonNull
	private String mem_name;
	// 회원 나이
	@NonNull
	private int mem_age;
	// 보호자 연락처
	@NonNull
	private String guard_phone;

	
	public String getMem_id() {
		return mem_id;
	}


	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}


	public String getMem_password() {
		return mem_password;
	}


	public void setMem_password(String mem_password) {
		this.mem_password = mem_password;
	}


	public String getMem_name() {
		return mem_name;
	}


	public void setMem_name(String mem_name) {
		this.mem_name = mem_name;
	}


	public int getMem_age() {
		return mem_age;
	}


	public void setMem_age(int mem_age) {
		this.mem_age = mem_age;
	}


	public String getGuard_phone() {
		return guard_phone;
	}


	public void setGuard_phone(String guard_phone) {
		this.guard_phone = guard_phone;
	}


	public String toString() {
		return "UserDTO [mem_id=" +mem_id + ",mem_password="+mem_password+"mem_name="+mem_name+"mem_age="+mem_age+"guard_phone="+guard_phone+"]";
		}
	
	
}
