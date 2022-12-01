package db4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import db3.DBConnect;

public class ProductDeleteMain {

	public static void main(String[] args) {
		Connection con = null;

		con = DBConnect.getConnection();

		Scanner sc = new Scanner(System.in);

		System.out.println("상품 정보 삭제");
		System.out.println("----------------");

		System.out.print("삭제할 상품번호 입력 : ");
		String prdNo = sc.nextLine();

		try {
			String sql = "delete from product where prdNo=?";

			PreparedStatement pstmt = con.prepareStatement(sql);

			pstmt.setString(1, prdNo);

			int result = pstmt.executeUpdate();

			if (result > 0) {
				System.out.println("상품정보 삭제 성공");
			}

			DBConnect.close(con, pstmt);
			sc.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}