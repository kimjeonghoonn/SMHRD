package com.example.demo;
 
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.dto.UserDTO;
import com.example.demo.service.UserService;
 
@ExtendWith(SpringExtension.class)
@SpringBootTest
public class TestApplicationTests {

	@Autowired
    private UserService uService;
    
    @Test
    public void userTest() 
    {
        UserDTO user = new UserDTO();
        user.setMem_id("test3");
        user.setMem_password("test3");
        user.setMem_name("테스트3");
        user.setMem_age(18);
        user.setGuard_phone("test3@test3.test");
        uService.join(user);
        System.out.println(uService.getUser("test3"));
        System.out.println("로그인 결과:"+uService.login("test3", "test3"));
        
    }

    
}