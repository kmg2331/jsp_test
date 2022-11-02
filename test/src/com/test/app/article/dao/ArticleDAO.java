package com.test.app.article.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.config.MyBatisConfig;
import com.test.app.article.vo.ArticleDTO;
import com.test.app.article.vo.ArticleVO;

public class ArticleDAO {
SqlSession sqlSession;
	
	public ArticleDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true); 
	}
	
	public List<ArticleVO> selectAll(){
		System.out.println("article.selectAll 실행");
		return sqlSession.selectList("article.selectAll");
	}
	
	public List<ArticleDTO> selectByMemberNumber(int memberNumber){
		List<ArticleDTO> list = sqlSession.selectList("article.selectByMemberNumber", memberNumber);
		return list;
	}
	
	public void write(ArticleVO vo) {
		System.out.println("article.write 실행");
		sqlSession.insert("article.write", vo);
	}
}
