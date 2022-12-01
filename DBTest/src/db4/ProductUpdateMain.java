package db4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import db3.DBConnect;

public class ProductUpdateMain {

	public static void main(String[] args) {
		Connection con = null;

		con = DBConnect.getConnection();

		Scanner sc = new Scanner(System.in);

		System.out.println("상품 정보 수정");
		System.out.println("----------------");

		System.out.print("수정할 상품번호 입력 : ");
		String prdNo = sc.nextLine();

		System.out.print("상품명 입력 : ");
		String prdName = sc.nextLine();

		System.out.print("가격 입력 : ");
		int prdPrice = sc.nextInt();

		System.out.print("제조사 입력 : ");
		String prdMaker = sc.nextLine();

		sc.nextLine();

		System.out.print("색상 입력 : ");
		String prdColor = sc.nextLine();

		System.out.print("제조사 번호 입력 : ");
		String ctgNo = sc.nextLine();

		try {
			String sql = "update product set prdName=?,prdPrice=?,prdMaker=?, prdColor=?, ctgNo=? where prdNo=?";

			PreparedStatement pstmt = con.prepareStatement(sql);

			pstmt.setString(1, prdName);
			pstmt.setInt(2, prdPrice);
			pstmt.setString(3, prdMaker);
			pstmt.setString(4, prdColor);
			pstmt.setString(5, ctgNo);
			pstmt.setString(6, prdNo);

			int result = pstmt.executeUpdate();

			if (result > 0) {
				System.out.println("상품정보 수정 성공");
			}

			DBConnect.close(con, pstmt);
			sc.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}