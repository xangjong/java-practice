package db4;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class ProductInsertMain {

	public static void main(String[] args) {

		Connection con = null;

		try {
			con = DBConnect.getConnection();

			// Connection 객체 생성되면 DB 연결 성공
			if (con != null) {
				System.out.println("상품 정보 등록 : DB 연결성공");
			}

			String prdNo = "17";
			String prdName = "알파스캔 모니터2";
			int prdPrice = 170000;
			String prdMaker = "알파스캔";
			String prdColor = "블랙";
			String ctgNo = "4";

			String sql = "insert into product values(?,?,?,?,?,?)";

			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, prdNo);
			pstmt.setString(2, prdName);
			pstmt.setInt(3, prdPrice);
			pstmt.setString(4, prdMaker);
			pstmt.setString(5, prdColor);
			pstmt.setString(6, ctgNo);

			int result = pstmt.executeUpdate();

			if (result > 0) {
				System.out.println("상품 정보 등록 성공");
			}

			DBConnect.close(con, pstmt);

		} catch (Exception e) {
			System.out.println("오류 발생");
			e.printStackTrace();
		}
	}

}