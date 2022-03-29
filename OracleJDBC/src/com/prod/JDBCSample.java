package com.prod;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//ojdbc 라이브러리 오라클 DB연결(db접속주소,hr,hr),Connection 객체
//query실행(Statement,preparedStatement)
public class JDBCSample {
//DriverManager
	static Connection conn;
	static Statement stmt;
	static ResultSet rs;
	static PreparedStatement psmt;

	public static Connection getConnect() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		System.out.println("====연결댐====");
		return conn;
	}
	
	

	public static void disconnect() {
		try {
			if (rs != null)
				rs.close();
			if (stmt != null)
				stmt.close();
			if (conn != null)
				conn.close();
			if (psmt != null) {
				psmt.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		conn = getConnect(); // DB연결작업// 이떄는 불러오기위한 용도로 널값임
		// DriverManger

		// Statement생성 쿼리를 실행하고 가져옴
		try {

			// 입력 사원번호,last_name 입사일자 이메일 job_id
			int emp_id = 300;
			String last_name = "김지찬";
			String hire_date = "2020-03-05";
			String email = "kildong@email.com";
			String job = "IT_prog";

			String fn = "킹지찬";
			String pn = "010-7777-1234";
			int salary = 9000;

			String sql = "delete from emp_java\r\n"
					+ "where employee_id = ?";
			
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, emp_id);// 1:sql 구문의 첫번째 물음표값을 설정
		
			int r = psmt.executeUpdate(); // 입력,수정,삭제
			System.out.println(r + "삭제댐 ㅠ");
			// 조회
//         rs = stmt.executeQuery("select * from emp_java");
//         while (rs.next()) { //
//            System.out.println("사원번호>> " + rs.getInt("employee_id"));
//            System.out.println("이름>>" + rs.getString("first_name"));
//
//         }
			
			
			
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		disconnect();// DB연결 끊는 작업
	}
}