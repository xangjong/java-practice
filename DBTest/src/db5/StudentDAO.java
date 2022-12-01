package db5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class StudentDAO {
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	public StudentDAO() {
		try {

//		연결 url, 사용자 계정, 패스워드 문자열로 지정 
			String url = "jdbc:mysql://localhost:3306/sqldb3?serverTimezone-UTC";
			String user = "root";
			String pwd = "1234";

//			DB 연결하기 위한 객체
//		DriverManage를 통해 Connection 객체 생성
//			mysql 서버 연결 : url, 사용자 계정, 패스워드 전송
//			
			con = DriverManager.getConnection(url, user, pwd);

//		Connection 객체 생성하면 DB 연결 성공
			if (con != null) {
				System.out.println("Db 연결 성공");
			}

		} catch (Exception e) {
			System.out.println("오류 발생");
			e.printStackTrace();
		}

	}

	// select 문 수행해서 데이터베이스의 student 테이블 내용 조회 / 출력할 메소드
	public void selectStudent() {

//		쿼리문 작성

		try {
			String sql = "select * from student order by stdNo";

			pstmt = con.prepareStatement(sql);
//			쿼리문 실행
			rs = pstmt.executeQuery(sql);

			while (rs.next()) {
				String stdNo = rs.getString(1);
				String stdName = rs.getString(2);
				int stdYear = rs.getInt(3);
				String stdAddress = rs.getString(4);
				Date stdBirthday = rs.getDate(5);
				String dptNo = rs.getString(6);
//			포맷 양식에서 숫자에서  s 사용시 오류 
				System.out.format("%-10s \t %-10s \t %-4d \t %20s \t %13s \t %5s \n", stdNo, stdName, stdYear,
						stdAddress, stdBirthday, dptNo);
			}

		} catch (SQLException e) {
			System.out.println("오류 발생");
			e.printStackTrace();
		}

	}

//	insert문 수행해서 student 테이블에 저장할 메소드
	public void insertStudent(StudentDTO dto) {
		try {
			String sql = "insert into student values(?, ?, ?, ?, ?, ? )";

			// sql 문 values에 들어갈 데이터 설정 -> surround try - catch
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dto.getStdNo());
			pstmt.setString(2, dto.getStdName());
			pstmt.setInt(3, dto.getStdYear());
			pstmt.setString(4, dto.getStdAddress());
			pstmt.setString(5, dto.getStdBirthday());
			pstmt.setString(6, dto.getDptNo());

			int result = pstmt.executeUpdate();
			if (result > 0) {
				System.out.println("데이터 입력 성공");
			}

		} catch (SQLException e) {
			System.out.println("오류 발생");
			e.printStackTrace();
		}

	}
}
