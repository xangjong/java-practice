package ch13_generic.sec13;

import java.util.HashMap;
import java.util.Map;

public class LoginController {
	public void loginCheck(Member m) {
		// HashMap에 저장
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("id", m.getId());
		map.put("password", m.getPasswd());

		// LoginDAO Map에 저장
		LoginDAO dao = new LoginDAO();
		dao.loginCheck(map);
	}
}
