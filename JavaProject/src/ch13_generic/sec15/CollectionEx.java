package ch13_generic.sec15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class CollectionEx {

	// 구분자 -> 사용해서 출력하는 메소드
	public static void printList(ArrayList<String> list) {
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
		String element = it.next();
		String separator;

		if (it.hasNext())
			separator = " -> ";
		else
			separator = "\n";
		System.out.print(element + separator);
		}
	}

	public static void main(String[] args) {
		// CollectionEx 클래스 예제
		ArrayList<String> myList = new ArrayList<String>();
		myList.add("트랜스포머");
		myList.add("스타워즈");
		myList.add("매트릭스");
		myList.add("터미네이터");
		myList.add("아바타");

		System.out.print("리스트 순서 : ");
		for (String movie : myList) {
			System.out.print(movie + " | ");
		}

		System.out.print("\n오름차순 정렬 : ");
		Collections.sort(myList);
		printList(myList);

		int index = Collections.binarySearch(myList, "스타워즈");
		System.out.println("스타워즈는" + "는(은)" + (index + 1) + "번째 입니다.");
		
		System.out.print("내림차순 정렬 : ");
		Collections.reverse(myList);
		printList(myList);
	}

}
