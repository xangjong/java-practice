package ch06_class.sec11_Ex;

public class MemberService {
	String id;
	String pw;

	public Boolean login(String id, String pw) {
		if (id.equals("hong") && pw.equals("12345")) {
			return true;
		} else {
			return false;
		}

	}

	public void logout(String id) {
		System.out.println(id+"이(가) 로그아웃 되었습니다");
	}
}