package com.test.app.member.dao;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.config.MyBatisConfig;
import com.test.app.member.vo.MemberVO;

public class MemberDAO {
	
	SqlSession sqlSession;
	
	public MemberDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true); 
	}
	
	public void join(MemberVO vo) {
		if(checkId(vo.getMemberId())) {
			sqlSession.insert("member.join", vo);
			return;
		}
		System.out.println("중복된 아이디. join() 실패.");
	}
	
	public boolean checkId(String id) {
			return (Integer)sqlSession.selectOne("member.checkId", id) == 0;
	}
	
	public boolean login(MemberVO vo) {
		return sqlSession.selectOne("member.login", vo);
	}
}
