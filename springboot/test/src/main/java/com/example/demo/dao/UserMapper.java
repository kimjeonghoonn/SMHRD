package com.example.demo.dao;

import java.util.List;

import com.example.demo.dto.UserDTO;

public interface UserMapper {
	public void insertUser (UserDTO user);
	public void updateUser (UserDTO user);
	public void deleteUser (String mem_id);
	public UserDTO selectOneUser (String mem_id);
	public List<UserDTO> selectAllUser();

}