package com.example.demo.service;

import java.util.HashMap;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.dao.BoardMapper;
import com.example.demo.dto.BoardDTO;

@Service
public class BoardServiceImpl implements BoardService {
    
    @Autowired
    private BoardMapper bMapper;
 
    @Override
    public void write(BoardDTO board) {
        // TODO Auto-generated method stub
        bMapper.insertBoard(board);
    }
 
    @Override
    public void modify(BoardDTO board) {
        // TODO Auto-generated method stub
        bMapper.updateBoard(board);
    }
 
    @Override
    public void remove(int num) {
        // TODO Auto-generated method stub
        bMapper.deleteBoard(num);
    }
 
    @Override
    public BoardDTO getBoard(int num) {
        // TODO Auto-generated method stub
        return bMapper.selectOneBoard(num);
    }
 
    @Override
    public List<BoardDTO> getBoardList() {
        // TODO Auto-generated method stub
        return bMapper.selectAllBoard();
    }
 
    @Override
    public List<BoardDTO> getBoardSearchList(HashMap<String, Object> params) {
        // TODO Auto-generated method stub
        return null;
    }
}