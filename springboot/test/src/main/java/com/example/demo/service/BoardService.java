package com.example.demo.service;

import java.util.HashMap;
import java.util.List;

import com.example.demo.dto.BoardDTO;

public interface BoardService {
	public void write(BoardDTO board);
	public void modify(BoardDTO board);
	public void remove(int num);
	public BoardDTO getBoard(int num);
	public List<BoardDTO> getBoardList();
	public List<BoardDTO> getBoardSearchList(HashMap<String,Object> params);
}