package ch13_generic.sec14;

import java.util.HashMap;
import java.util.Map;

public class LoginDAO {
	public void loginCheck(HashMap<String, Member> map) {
		
		System.out.println("id : " + map.get("mem").getId());
		System.out.println("password : " + map.get("mem").getPasswd());

	}
}
