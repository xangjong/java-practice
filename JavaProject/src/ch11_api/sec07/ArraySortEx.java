package ch11_api.sec07;

import java.util.Arrays;
import java.util.Collections;

public class ArraySortEx {

	public static void main(String[] args) {
//	Arrays Sort() 예제
		int[] scores = { 99, 97, 98};
		Arrays.sort(scores);
		for(int i=0; i<scores.length; i++) {
			System.out.print(scores[i] + " ");
		}
		System.out.println();
		
		String[] names = { "홍길동", "이몽룡", "성춘향"};
		Arrays.sort(names);
		for(int i=0; i<names.length; i++) {
			System.out.print(names[i] + " ");
		}
		
		System.out.println();

		// 역순 : Collections.reverseOrder()
		Arrays.sort(names, Collections.reverseOrder());
		for(int i=0; i<names.length; i++) {
			System.out.print(names[i] + " ");
		}
		
		System.out.println();

		// 주의 : int[] 는 사용 불가
//		Arrays.sort(scores, Collections.reverseOrder());
		

		Integer[] scores2 = { 10, 99, 30, 40, 55};
		Arrays.sort(scores2, Collections.reverseOrder());
		for(int i=0; i<scores2.length; i++) {
			System.out.print(scores2[i] + " ");
		}
		
	}

}
