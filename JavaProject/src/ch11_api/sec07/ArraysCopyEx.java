package ch11_api.sec07;

import java.util.Arrays;

public class ArraysCopyEx {

	public static void main(String[] args) {
//	 	배열 복사 예제
		char[] arr1 = { 'J', 'A', 'V', 'A'};
		
//		방법 1 
		char[] arr2 = Arrays.copyOf(arr1, arr1.length);
		System.out.println(Arrays.toString(arr2));
		
//		방법 2
		char[] arr3 = Arrays.copyOfRange(arr1, 1, 3); // 시작 1 ~ 끝 3 (3-1)
		System.out.println(Arrays.toString(arr3));

//		방법 3 
		char[] arr4 = new char[arr1.length];
		System.arraycopy(arr1, 0, arr4, 0, arr1.length);
		for(int i=0; i<arr4.length; i++) {
			System.out.println("arr4[" + i + "]=" + arr4[i]);
		}
		System.out.println(Arrays.toString(arr4));
		
	}

}
