package db3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class BookDeleteMain {

	public static void main(String[] args) {
		// jdbc : 도서 정보 삭제 클래스(delete 수행)
		
		Connection con = null;
//		1. db 연결
		con = DBConnect.getConnection();
		
//		2. 삭제할 도서 번호 입력
		Scanner sc = new Scanner(System.in);
		
		System.out.println("도서 정보 삭제");

		System.out.print("삭제할 도서번호 입력:");
		String bookNo = sc.nextLine();
		
//		3. 쿼리문 작성 : delete
		try {
			String sql = "delete from book where bookNo=?";
			
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, bookNo);
			
//		4. 쿼리문 실행 : executeUpdate()
			int result = pstmt.executeUpdate();
			
			if (result>0) {
				System.out.println("도서 정보 삭제 성공");
			}
			
//		5. 리소스 close()
			DBConnect.close(con, pstmt);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
