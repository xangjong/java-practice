package ch11_api.sec04;

import java.util.Properties;
import java.util.Set;

public class GetProperyEx {

	public static void main(String[] args) {
		String osName = System.getProperty("os.name");
		String userName = System.getProperty("user.name");
		String userHome = System.getProperty("user.home");

		System.out.println("운영체제 이름 : " + osName);
		System.out.println("사용자 이름 : " + userName);
		System.out.println("사용자 홈디렉토리 : " + userHome);

		System.out.println("----------");
		System.out.println(" [ key ] value ");
		System.out.println("----------");
		
		Properties props = System.getProperties();
		Set keys = props.keySet();
		for(Object objkey : keys) {
			String key = (String) objkey;
			String value = System.getProperty(key);
			System.out.println(" [ key ] value " + value);

		}
		
	}

}
