package db1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class BookInsertMain {

	public static void main(String[] args) {
		// jdbc : 도서 정보 등록 클래스 (insert 수행)
		try {
//			jdbc Driver 클래스의 객체 생성 런타임시 로드 
			Class.forName("com.mysql.cj.jdbc.Driver"); // 없어도 오류 x

//		연결 url, 사용자 계정, 패스워드 문자열로 지정 
			String url = "jdbc:mysql://localhost:3306/sqldb3?serverTimezone-UTC";
			String user = "root";
			String pwd = "1234";

//			DB 연결하기 위한 객체
//			DriverManage를 통해 Connection 객체 생성
//			mysql 서버 연결 : url, 사용자 계정, 패스워드 전송

			Connection con = DriverManager.getConnection(url, user, pwd);

//		1. db 연결
//		Connection 객체 생성하면 DB 연결 성공
			if (con != null) {
				System.out.println("도서 정보 등록 : Db 연결 성공");
			}
//			저장할 데이터 변수에 저장해서 사용
			String bookNo = "1018";
			String bookName = "알고리즘";
			String bookAuthor = "김철수";
			int bookPrice = 25000;
			String bookDate = "2022-01-05";
			int bookStock = 10;
			String pubNo = "1";
//		

//		2. 쿼리문 작성 : insert
//		저장할 데이터 위치 설정 : values(?,?,?,?,?,?,?) 
			String sql = "insert into book values(?,?,?,?,?,?,?)";

//		3. sql문 values에 들어갈 데이터 설정 
//		setXXX() 메소드 사용 : pstmt.setString(1, bookNo)
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, bookNo);
			pstmt.setString(2, bookName);
			pstmt.setString(3, bookAuthor);
			pstmt.setInt(4, bookPrice);
			pstmt.setString(5, bookDate);
			pstmt.setInt(6, bookStock);
			pstmt.setString(7, pubNo);

//		4. 쿼리문 실행 : executeUpdate()
//		영향을 받은 행의 수 반환 
//		작업 완료 메세지 출력
//		result가 0보다 크면 입력 성공 (1행이라도 영향을 받았으면 성공)
//		pstmt.executeUpdate(); 
			int result = pstmt.executeUpdate();
			if (result > 0) {
				System.out.println("도서 정보 등록 성공");
			}

		} catch (Exception e) {
			System.out.println("오류 발생");
			e.printStackTrace();
		}

	}

}
