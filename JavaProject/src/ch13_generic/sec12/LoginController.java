package ch13_generic.sec12;

import java.util.HashMap;
import java.util.Map;

public class LoginController {
	public void loginCheck(String id, String password) {
		// HashMap에 저장
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("id", id);
		map.put("password", password);

		// LoginDAO Map에 저장
		LoginDAO dao = new LoginDAO();
		dao.loginCheck(map);
	}
}
