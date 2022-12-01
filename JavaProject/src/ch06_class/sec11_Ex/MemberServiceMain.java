package ch06_class.sec11_Ex;

public class MemberServiceMain {

	public static void main(String[] args) {
MemberService one = new MemberService();
		
		boolean result = one.login("hong", "12345");
		
		if (result) {  //  (result==true)
			System.out.println("로그인되었습니다.");
			one.logout("hong");
		} else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
	}

}