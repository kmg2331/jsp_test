package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCutil {
	public Connection getConnection() {
		
		Connection conn = null;
		String id = "root", pswd = "1234";
		String database = "test";
		String url = "jdbc:mysql://localhost:3306/" + database;
		String driver = "com.mysql.cj.jdbc.Driver";
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, id, pswd);
			System.out.println("연결 성공");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("드라이버 로딩 실패");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Connection 객체 로딩 실패");
		}
		
		return conn;
	}
	
}
