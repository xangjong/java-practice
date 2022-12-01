package ch08_interface.sec04;

public class MemberController {
	// 회원 가입 데이터를 전달하면 데이터를 받아서
	MemberDAO dao = new MemberDAO();

	// MemberDAO 클래스의 insertMember() 메소드에게 전달
	public void insertMember(MemberDTO dto) {
		dao.insertMember(dto);
	}
}
