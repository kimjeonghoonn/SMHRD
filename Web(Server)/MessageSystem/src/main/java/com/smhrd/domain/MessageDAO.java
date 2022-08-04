package com.smhrd.domain;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.smhrd.database.SqlSessionManager;

public class MessageDAO {

	// SqlSessionFactiory 생성 (연결해야하는 DB 설정 정보 가지고 있음)
		// -> Session 생성 ( DB연결, 작업수행, 종료 작업)
		SqlSessionFactory sqlSessionFactory = SqlSessionManager.getSqlSession();
		SqlSession sqlSession = sqlSessionFactory.openSession();

		//메세지 삽입 기능
	public int insertMessage(Message ms_vo) {
		      
		      int cnt = 0;
		      
		      try {
		         cnt = sqlSession.insert("com.smhrd.domain.MessageDAO.insertMessage", ms_vo);
		         if(cnt>0) {
		            sqlSession.commit();
		         }else {
		            sqlSession.rollback();
		         }
		      }catch(Exception e) {
		         e.printStackTrace();
		      }finally {
		         sqlSession.close();
		      }
		      return cnt;
		   }
	
	
	//로그인한 사용자한테 도착한 메세지 가져오는 메서드
										//email : 현재 로그인한 사용자의 이메일
	public List<Message> selectMessage(String email) {
		
		List<Message> messageList = null;
		
		 try {
			messageList = sqlSession.selectList("com.smhrd.domain.MessageDAO.selectMessage", email);
			
			if(messageList != null) {
				sqlSession.commit();
			}else {
				sqlSession.rollback();
			}
		 }catch(Exception e) {
			 e.printStackTrace();
		 }finally {
			 sqlSession.close();
		 }
		 return messageList;
	 }
	
	//메세지 삭제
	public int deleteOneMessage(int msgNum) {
		int cnt = 0;
		try {
			cnt = sqlSession.delete("com.smhrd.domain.MessageDAO.deleteMessage", msgNum);
			
			if(cnt >0) {
				sqlSession.commit();
			}else {
				sqlSession.rollback();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			sqlSession.close();
		}
		return cnt;
	}
	
	//메세지 전체 삭제
	public int deleteAllMessage(String email) {
		int cnt = 0;
		try {
			cnt = sqlSession.delete("com.smhrd.domain.MessageDAO.deleteAllMessage",email );
			
			if(cnt >0) {
				sqlSession.commit();
			}else {
				sqlSession.rollback();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			sqlSession.close();
		}
		return cnt;
	}
	
}
