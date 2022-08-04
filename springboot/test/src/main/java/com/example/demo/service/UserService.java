package com.example.demo.service;

import java.util.List;
import com.example.demo.dto.UserDTO;

public interface UserService {
	public boolean login (String userId, String userPw);
	public boolean join (UserDTO user);
	public void modify(UserDTO user);
	public void withdraw(String userId);
	public UserDTO getUser(String userId);
	public List<UserDTO> getUserList();
}