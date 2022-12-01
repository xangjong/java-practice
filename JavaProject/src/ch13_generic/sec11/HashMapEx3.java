package ch13_generic.sec11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HashMapEx3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, String> map = new HashMap<String, String>();

		map.put("apple", "사과");
		map.put("summer", "여름");
		map.put("candy", "사탕");
		map.put("school", "학교");
		map.put("water", "물");

		while (true) {
			System.out.print("찾고 싶은 단어는?");
			String str = sc.next();
			if (str.equals("exit")) {
				System.out.println("종료합니다....");
				break;
			}
			if (map.get(str) == null)
				System.out.println(str + "는 없는 단어입니다.");
			else
				System.out.println(map.get(str));

		}
		sc.close();

	}

}
