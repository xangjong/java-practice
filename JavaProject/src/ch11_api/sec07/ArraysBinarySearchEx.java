package ch11_api.sec07;

import java.util.Arrays;

public class ArraysBinarySearchEx {

	public static void main(String[] args) {
//		Arrays BinarySearch() 예제
		int[] scores = {99, 97, 98};
		Arrays.sort(scores);
		System.out.println(Arrays.toString(scores));
		
		int index = Arrays.binarySearch(scores, 99);
		System.out.println((index+1) + "번째 위치");
		
		System.out.println();
		
		String[] names = { "홍길동", "이몽룡", "성춘향"};
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));
		index = Arrays.binarySearch(names, "이몽룡");
		System.out.println((index+1) + "번째 위치");
	}

}
