package ch13_generic.sec07;

import java.util.Arrays;
import java.util.List;

public class ArraysAsListEx {

	public static void main(String[] args) {
//		Arrays.asList() : 고정된 객체들로 구성된 List 생성 예제
		List<String> list1 = Arrays.asList("홍길동", "이몽룡", "성춘향");
		
		for(String name : list1) {
			System.out.println(name);
		}
		
//		list2 정수 : 1, 2, 3 
		
		List<Integer> list2 = Arrays.asList(1, 2, 3 );
		
		for(Integer num : list2) {
			System.out.println(num);
		}
	}

}
