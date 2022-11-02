package com.test.app.member.dao;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.config.MyBatisConfig;
import com.test.app.member.vo.MemberVO;

public class MemberDAO {
	
	SqlSession sqlSession;
	
	public MemberDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true); 
	}
	
	public boolean join(MemberVO vo) {
		if(checkId(vo.getMemberId())) {
			sqlSession.insert("member.join", vo);
			return true;
		} else return false;
	}
	
	public int lastJoinMemberNumber() {
		return sqlSession.selectOne("member.lastJoinMemberNumber");
	}
	
	public boolean checkId(String id) {
			return (Integer)sqlSession.selectOne("member.checkId", id) == 0;
	}
	
	public int login(MemberVO vo) {
		return sqlSession.selectOne("member.login", vo);
	}
}
