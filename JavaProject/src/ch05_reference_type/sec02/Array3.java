package ch05_reference_type.sec02;

public class Array3 {

	public static void main(String[] args) {
		// 배열의 초기값
		// 메모리를 할당 받을 때 자료형의 기본값으로 초기화

		// 정수 : 0으로 초기화
		int[] arr1 = new int[3];
		for (int i = 0; i < arr1.length; i++)
			System.out.println("arr1[" + i + "] : " + arr1[i]);

		// 실수 : 0.0으로 초기화
		double[] arr2 = new double[3];
		for (int i = 0; i < arr2.length; i++)
			System.out.println("arr2[" + i + "] : " + arr2[i]);

		// boolean : false로 초기화
		boolean[] arr3 = new boolean[3];
		for (int i = 0; i < arr3.length; i++)
			System.out.println("arr3[" + i + "] : " + arr3[i]);

		// String 객체 : null로 초기화
		String[] arr4 = new String[3];
		for (int i = 0; i < arr4.length; i++)
			System.out.println("arr4[" + i + "] : " + arr4[i]);

	}

}
