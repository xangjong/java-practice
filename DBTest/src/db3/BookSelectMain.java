package db3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;

public class BookSelectMain {

	public static void main(String[] args) {
		// jdbc : 도서 정보 조회 클래스(select 수행)

		Connection con = null;
//		1. db 연결
		try {
			con = DBConnect.getConnection();

//		2. select 쿼리문 작성
			String sql = "select * from book where bookPrice>=25000 order by bookNo";
			

//		3. 쿼리문 전송을 위한 PreparedStatement 객체 생성
//			Connection 인터페이스의 prepareStatement() 메소드를 사용하여 객체 생성
		PreparedStatement pstmt = con.prepareStatement(sql);

//		4. 쿼리문 실행시키고 결과 받아옴
//		execute() 메소드 사용
//		결과는 ResultSet 객체가 받음
		ResultSet rs = pstmt.executeQuery(sql);
		
		System.out.println("도서 정보 조회");
		System.out.println("도서 번호\t\t\t도서명 \t\t\t\t저자\t  가격\t\t발행일 \t재고\t\t출판사번호");
//		5. executeQuery() 실행 결과 받아온 ResultSet에서 데이터 추출
//		ResultSet의 next() 메소드를 이용해서 논리적 커서 이동해하면서 다음 행 지정
//	 	다음 행이 있으면 true, 없으면 false 반환
//		모든 행 가져오려면 반복문 사용
//		데이터 타입에 맞춰 getxxx() 메소드 사용 
		while(rs.next()) {
			String bookNo = rs.getString(1);
			String bookName = rs.getString(2);
			String bookAuthor = rs.getString(3);
			int bookPrice = rs.getInt(4);
			Date bookDate = rs.getDate(5);
			int bookStock = rs.getInt(6);
			String pubNo = rs.getString(7);
			
//		6. 한 행씩 출력
			System.out.format("%-10s\t%-25s\t%10s\t%6d\t%13s\t%3d\t%10s\n", 
					bookNo, bookName, bookAuthor, bookPrice, bookDate, bookStock, pubNo);
		 }
		
//		7. 리소스 닫기(close)
		DBConnect.close(con, pstmt, rs);
		
		} catch (Exception e) {
			System.out.println("오류 발생");
			e.printStackTrace();
		}

	}

}
