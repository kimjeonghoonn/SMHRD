package com.smhrd.domain;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.smhrd.database.SqlSessionManager;

public class DAO {
	SqlSessionFactory sqlSessionFactory = SqlSessionManager.getSqlSession();
	SqlSession sqlSession = sqlSessionFactory.openSession();

	// 회원가입
	public int join(Member m_vo) {
		int cnt = 0;
		try {
			// sql문이 제대로 실행되었을때(가입 성공) -> commit
			// sql문 실행 시 오류(가입 실패) -> rollback
			// cnt -> 제대로 삽입(1) , 안된 경우(0)

			cnt = sqlSession.insert("com.smhrd.domain.DAO.insert", m_vo);

			if (cnt > 0) {
				sqlSession.commit();
			} else {
				sqlSession.rollback();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}
		return cnt;
	}

	public Member login(Member m_vo) {
		Member m = null;
		try {
			// sql문이 제대로 실행되었을때(가입 성공) -> commit
			// sql문 실행 시 오류(가입 실패) -> rollback
			// cnt -> 제대로 삽입(1) , 안된 경우(0)

			m = (Member)sqlSession.selectOne("com.smhrd.domain.DAO.selectOne", m_vo);

			if (m != null) {
				sqlSession.commit();
			} else {
				sqlSession.rollback();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}
		return m;
	}
	
	
}
