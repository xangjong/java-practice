package ch13_generic.sec14;

import java.util.HashMap;
import java.util.Map;

public class LoginMain {
	public static void main(String[] args) {

		String id = "abcd";
		String passwd = "1234";
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("abcd", "1234");
		
		
//		LoginController의 loginCheck() 호출하면서 id, passwd 전달
		
		LoginController lc = new LoginController();
		lc.loginCheck(new Member("abcd", "1234"));
	}
}
