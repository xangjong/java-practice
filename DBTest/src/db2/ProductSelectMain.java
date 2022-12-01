package db2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ProductSelectMain {

	public static void main(String[] args) {
		// 상품 정보 조회
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
			String sql = "select * from product order by prdNo";
		
			PreparedStatement pstmt = con.prepareStatement(sql);
		
			ResultSet rs = pstmt.executeQuery(sql);
			
//			행 정보 출력 
			System.out.println("상품 정보 조회");
			System.out.println("prdNo\t\tprdName\t\tprdPrice\tprdMaker\tprdColor\tctgNo");
//			
			while(rs.next()) {
				String prdNo = rs.getString(1);
				String prdName = rs.getString(2);
				int prdPrice = rs.getInt(3);
				String prdMaker = rs.getString(4);
				String prdColor = rs.getString(5);
				String ctgNo = rs.getString(6);
				
				System.out.format("%-10s\t%-10s\t%-5s\t%10s\t%10s\t%10s\n",
						prdNo, prdName, prdPrice, prdMaker, prdColor, ctgNo);
			} 	
		
			rs.close();
			pstmt.close();
			con.close();
			
		} catch (Exception e) {
			System.out.println("오류 발생");
			e.printStackTrace();
		}
	}

}
