package com.example.demo.dao;

import java.util.HashMap;
import java.util.List;

import com.example.demo.dto.BoardDTO;

public interface BoardMapper {
public void insertBoard (BoardDTO board);
    public void updateBoard (BoardDTO board);
    public void deleteBoard (int b_number);
    public BoardDTO selectOneBoard (int b_number);
    public List<BoardDTO> selectSearchBoard (HashMap<String, Object> params);
    public List<BoardDTO> selectAllBoard();
}