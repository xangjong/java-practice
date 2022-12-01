package ch02_variable.sec04;

import java.util.Scanner;

// import 문 자동 입력 : Ctrl + Shift + O


public class input {

	public static void main(String[] args) {
		// 키보드로부터 입력 받기 위해 Scanner 객체 생성
		Scanner sc = new Scanner(System.in);
		int num1, num2; 
		
		System.out.print("첫 번째 숫자 입력 : ");
		num1 = sc.nextInt(); // 입력한 값을 정수로 변환해서 반환 -> num1에 저장
		
		System.out.print("두 번째 숫자 입력 : ");
		num2 = sc.nextInt(); // 입력한 값을 정수로 변환해서 반환 -> num2에 저장
		
		System.out.println("=======================");
		
		System.out.println("두 수의 합 : " +(num1 + num2));
		System.out.println("두 수의 곱 : " + (num1 * num2));
		
		sc.close();
	}

}
