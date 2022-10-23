package com.mybatis.config;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisConfig {
	
	private static SqlSessionFactory sqlsessionFactory;
	
	static {
		try {
			String resource = "./com/mybatis/config/config.xml";
			Reader reader = Resources.getResourceAsReader(resource);
			sqlsessionFactory = new SqlSessionFactoryBuilder().build(reader);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static SqlSessionFactory getsqlSessionFactory() {
		return sqlsessionFactory;
	}
}
