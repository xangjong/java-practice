package db2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ProductInsertMain {

	public static void main(String[] args) {
		// 상품 정보 등록
		try {
//			jdbc Driver 클래스의 객체 생성 런타임시 로드 
			Class.forName("com.mysql.cj.jdbc.Driver"); // 없어도 오류 x

//		연결 url, 사용자 계정, 패스워드 문자열로 지정 
			String url = "jdbc:mysql://localhost:3306/sqldb3?serverTimezone-UTC";
			String user = "root";
			String pwd = "1234";

			Connection con = DriverManager.getConnection(url, user, pwd);

//			
			if (con != null) {
				System.out.println("상품 정보 등록 : Db 연결 성공");
			}
//				저장할 데이터 변수에 저장해서 사용
			String prdNo = "1016";
			String prdName = "초고속 낙하산";
			int prdPrice = 250000;
			String prdMaker = "애플";
			String prdColor = "스페이스 그레이";
			String ctgNo = "7";
//			

//			2. 쿼리문 작성 : insert
//			저장할 데이터 위치 설정 : values(?,?,?,?,?,?,?) 
			String sql = "insert into product values(?,?,?,?,?,?)";

//			3. sql문 values에 들어갈 데이터 설정 
//			setXXX() 메소드 사용 : pstmt.setString(1, bookNo)
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, prdNo);
			pstmt.setString(2, prdName);
			pstmt.setInt(3, prdPrice);
			pstmt.setString(4, prdMaker);
			pstmt.setString(5, prdColor);
			pstmt.setString(6, ctgNo);

//			4. 쿼리문 실행 : executeUpdate()
//			영향을 받은 행의 수 반환 
//			작업 완료 메세지 출력
//			result가 0보다 크면 입력 성공 (1행이라도 영향을 받았으면 성공)
//			pstmt.executeUpdate(); 
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
