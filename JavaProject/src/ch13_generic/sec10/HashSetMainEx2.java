package ch13_generic.sec10;

import java.util.HashSet;
import java.util.Set;

public class HashSetMainEx2 {

	public static void main(String[] args) {
//		HashSet 중복 저장 안 되는 경우
//		Member 클래스에서 hasCode()와 equals() 메소드가 재정의 
	Set<Member> set = new HashSet<Member>(); 
	
	set.add(new Member("홍길동", 30));
	set.add(new Member("홍길동", 30));

	System.out.println("총 객체 수 : " + set.size());
		
	
	}

}
