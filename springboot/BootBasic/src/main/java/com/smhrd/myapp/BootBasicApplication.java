package com.smhrd.myapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//빈 등록 및 자동설정을 수행
@SpringBootApplication
public class BootBasicApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootBasicApplication.class, args);
	}

}
