package ch13_generic.sec11;

import java.util.HashMap;
import java.util.Map;

public class HashMapMain {

	public static void main(String[] args) {
		/*	Map<String, Integer>map  = new HashMap<String, Integer>();
		
			map.put("kim", 100);
			map.put("kim", 100);
			
			System.out.println("총 Entry 수 : " + map.size()); // 1

		//	String은 문자열이 같을 경우 동등 객체가 될 수 있도록
		//	hashCode()의 equals() 메소드가 재정의 되어 있음
		//	"kim" 값이 같으므로 동등 객체로 인식
		*/		
		
		Map<Student, Integer> map = new HashMap<Student, Integer>();
		map.put(new Student(1,"홍길동"), 95);
		map.put(new Student(1,"홍길동"), 95);

		
		
		
		System.out.println("총 Entry 수 : " + map.size()); // 2
		
	}

}
