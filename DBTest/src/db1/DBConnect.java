package db1;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {

	public static void main(String[] args) {
		// db 연결

		try {
//			jdbc Driver 클래스의 객체 생성 런타임시 로드 
			Class.forName("com.mysql.cj.jdbc.Driver"); // 없어도 오류 x

//		연결 url, 사용자 계정, 패스워드 문자열로 지정 
			String url = "jdbc:mysql://localhost:3306/sqldb3?serverTimezone-UTC";
			String user = "root";
			String pwd = "1234";

//			DB 연결하기 위한 객체
//		DriverManage를 통해 Connection 객체 생성
//			mysql 서버 연결 : url, 사용자 계정, 패스워드 전송
//			
		Connection con = DriverManager.getConnection(url, user, pwd);
		
//		Connection 객체 생성하면 DB 연결 성공
		if(con!=null) {
			System.out.println("Db 연결 성공");
		}
		
		} catch (Exception e) {
			System.out.println("오류 발생");
			e.printStackTrace();
		}

	}

}
