package ch08_interface.sec04;

import java.util.ArrayList;

public class MemberDAO implements IMemberDAO {

	@Override
	public void insertMember(MemberDTO dto) {
		// DB에 저장했다고 가정
		System.out.println("회원 등록 성공");
		System.out.println("ID : " + dto.getMemId());
		System.out.println("비밀번호 : " + dto.getMemPass());
		System.out.println("성명 : " + dto.getMemName());
		System.out.println("전화 : " + dto.getMemPhone());
		System.out.println("주소 : " + dto.getMemAdress());

	}

	@Override
	public void deleteMember(String MemId) {
		// TODO Auto-generated method stub

	}

	@Override
	public ArrayList<MemberDTO> getAllMember() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateMember(MemberDTO dto) {
		// TODO Auto-generated method stub

	}

}
