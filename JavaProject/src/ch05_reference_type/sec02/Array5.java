package ch05_reference_type.sec02;

import java.util.Scanner;

public class Array5 {

	public static void main(String[] args) {
		// 입력 받은 값을 배열에 저장
		String names[] = new String[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 입력 : ");
		for (int i = 0; i < names.length; i++) {
			System.out.print("names [" + i + "] = ");
			names[i] = sc.next();
		}
		System.out.println("--------");
		System.out.println("입력된 값 출력 ");
		for(int i=0; i<names.length; i++) {
			System.out.println("naems[" + i + "] : " + names[i]);
		}
			
		sc.close();
		// 5명의 이름을 입력 받아서 배열에 저장하고
		// 배열에 저장된 값 출력

		// 이름 출력
		// name[0] : 손흥민
		// ..

		// 입력한 값 출력
		//
	}

}
