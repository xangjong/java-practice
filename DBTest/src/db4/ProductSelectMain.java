package db4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ProductSelectMain {

	public static void main(String[] args) {
		// JDBC : 도서정보 조회 클래스 (SELECT 수행)
		Connection con = null;
		// (1) DB 연결
		try {
			con = DBConnect.getConnection();

			// Connection 객체 생성되면 DB 연결 성공
			if (con != null) {
				System.out.println("상품 정보 조회 : DB 연결성공");
			}

			// (2) SELECT 쿼리문 작성
			String sql = "select * from product";

			// (3) 쿼리문 전송을 위한 PreparedStatement 객체 생성
			// Connection 인터페이스의 preparedStatement() 메소드를 사용하여 객체 생성
			PreparedStatement pstmt = con.prepareStatement(sql);

			// (4) 쿼리문 실행시키고 결과 받아옴
			// executeQuery() 메소드 사용
			// 결과는 ResultSet 객체가 받음
			ResultSet rs = pstmt.executeQuery(sql);

			// (5) executeQuery() 실행 결과 받아온 ResultSet에서 데이터 추출
			// ResultSet의 next() 메소드를 이용해서 논리적 커서 이동해가면서 다음 행 지정
			// -- 다음 행이 있으면 true, 없으면 false 반환
			// 모든 행 가져오려면 반복문 사용
			// 데이터타입에 맞춰 getXXX() 메소드 사용
			while (rs.next()) {
				String prdNo = rs.getString(1);
				String prdName = rs.getString(2);
				int prdPrice = rs.getInt(3);
				String prdMaker = rs.getString(4);
				String prdColor = rs.getString(5);
				String ctgNo = rs.getString(6);

				// (6) 한 행씩 출력
				System.out.format("%-10s \t %-25s \t %6d \t %13s \t %10s \t %10s\n", prdNo, prdName, prdPrice, prdMaker,
						prdColor, ctgNo);
			}

			// (7) 리소스 닫기 (close)
			DBConnect.close(con, pstmt, rs);

		} catch (Exception e) {
			System.out.println("오류 발생");
			e.printStackTrace();
		}

	}

}