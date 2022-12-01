package ch08_interface.sec04;

import java.util.ArrayList;

public interface IMemberDAO {
	// 추상 메소드 선언
	public void insertMember(MemberDTO dto); 	// 회원 등록
	public void deleteMember(String MemId); 	// 회원 정보 삭제
	public ArrayList<MemberDTO> getAllMember(); // 전체 회원 정보 조회
	public void updateMember(MemberDTO dto); 	// 회원 정보 수정 
	
}
