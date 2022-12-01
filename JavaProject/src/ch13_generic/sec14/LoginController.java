package ch13_generic.sec14;

import java.util.HashMap;
import java.util.Map;

public class LoginController {
	public void loginCheck(Member mem) {
		// HashMap에 저장
		HashMap<String, Member> map = new HashMap<String, Member>();
		map.put("mem", mem);

		// LoginDAO Map에 저장
		LoginDAO dao = new LoginDAO();
		dao.loginCheck(map);
	}
}
