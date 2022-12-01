package ch05_reference_type.sec02;

public class Array1 {

	public static void main(String[] args) {
		// 배열 선언, 값 저장, 원소의 값 출력 
		int [] a; // 배열 a 선언함, 메모리 할당X
		a = new int[3]; //메모리 할당
		
		// 배열 a의 각 원소에 값 직접 저장
		
		a[0] =10;
		a[1] =20;
		a[2] =30;
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		
		System.out.println("------");
		
		//for문 사용해서 배열의 전체 원소의 값 출력
		for(int i=0; i<a.length; i++)
			System.out.println(a[i]);
	} 

}
