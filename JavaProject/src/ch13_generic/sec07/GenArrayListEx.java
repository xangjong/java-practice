package ch13_generic.sec07;

import java.util.ArrayList;
import java.util.List;

public class GenArrayListEx {

	public static void main(String[] args) {
//		ArrayList : 제네릭 타입인 경우
		List<String> list = new ArrayList<String>();
		
		list.add("JAVA");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2,"Database");
		list.add("MyBatis");
//		list.add(100); 	주의 : String 타입이 아니면 오류
		
		System.out.println("총 개체수 : " + list.size());
		
		System.out.println();
		for(int i=0; i<list.size(); i++) {
			System.out.println(i + ":" + list.get(i));
		}
		
		
		System.out.println();
		
		System.out.println("2 : " + list.get(2));
	
		System.out.println();
		
		list.remove(2);
		list.remove(2);
		list.remove("MyBatis");
		
		for(String value : list) { 
			System.out.println(value);
		}
		
		System.out.println();
		
//		각 항목(객체)의 길이 출력
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i) + ":" + list.get(i).length());
		}
		
		for(String value : list) {
			System.out.println(value +":" + value.length());
		}
		
		
		
		
	}

}
