package com.first.begin;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;


public class DBConnectionTest {

	private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String USER = "project";
	private static final String PW = "project";
	
	@Test
	public void test() throws Exception {
		Class.forName(DRIVER);
		
		try(Connection conn = DriverManager.getConnection(URL,USER,PW))
		{
			System.out.println("오라클에 연결되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
