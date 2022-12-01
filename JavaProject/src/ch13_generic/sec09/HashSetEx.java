package ch13_generic.sec09;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {

	public static void main(String[] args) {
//	HashSet 예제
		Set<String> set = new HashSet<String>();

		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java"); // 중복 저장 안 됨
		set.add("MyBatis");

		System.out.println("총 객체 수 : " + set.size());

		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println();
		
		set.remove("JDBC");
		set.remove("MyBatis");

		System.out.println("총 객체 수 : " + set.size());

		for (String e : set) {
			System.out.println(e);
		}
		
		System.out.println();
		
		set.clear(); // 모든 객체 제거하고 비움
		if(set.isEmpty()) {
			System.out.println("비어 있음");
		}

	}

}
