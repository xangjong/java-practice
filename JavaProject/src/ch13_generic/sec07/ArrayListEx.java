package ch13_generic.sec07;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
//		ArrayList : 제네릭 타입이 아닌 경우 예제
		ArrayList list = new ArrayList();
//		리스트에 항목 추가 : add()
//		다양한 타입의 데이터 저장 가능
		list.add(100);
		list.add("홍길동");
		list.add(3.14159);
		list.add("자바");
		list.add("자바"); // 중복 저장 가능

//	항목 값 변환 : get(인덱스)
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
//		특정 위치에 항목 추가 : 한 칸씩 다음으로 위치 이동
		list.add(0, "위치 이동");
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
		
//		특정 인덱스의 항목 삭제
//		이후 한 칸씩 앞으로 이동
		list.remove(1);
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		
	}

}
