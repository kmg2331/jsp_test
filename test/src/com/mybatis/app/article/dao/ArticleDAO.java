package com.mybatis.app.article.dao;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.config.MyBatisConfig;

public class ArticleDAO {
	
	public SqlSession sqlSession;
	
	public ArticleDAO() {
		sqlSession = MyBatisConfig.getsqlSessionFactory().openSession(true);
	}
	
	public void insertAll(Map<String, String[]> map) {
		
		HashMap<String, String> paramMap = new HashMap<String, String>();
		
		for(String key : map.keySet()) {
			String value = map.get(key)[0];
			paramMap.put(key, value);
		}
		
		sqlSession.insert("article.insertAll", paramMap);
	}
}
