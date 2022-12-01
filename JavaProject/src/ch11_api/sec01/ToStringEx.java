package ch11_api.sec01;

import java.util.Date;

public class ToStringEx {

	public static void main(String[] args) {
		Object obj = new Object();
		Date date = new Date();
		String str = new String("홍길동");
		
		System.out.println(obj.toString());
		System.out.println(date.toString());
		System.out.println(date.toGMTString()); // deprecated
		System.out.println(date.toLocaleString()); // deprecated
		System.out.println(str.toString());
	}

}
