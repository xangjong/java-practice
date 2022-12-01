package ch10_exception.sec02;

import java.util.Scanner;

public class ExceptionEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x ,y;
		System.out.print("정수 1 입력 : ");
		x = sc.nextInt();
		System.out.print("정수 2 입력 : ");
		y = sc.nextInt();
		
		try { System.out.println("나누기 결과 : " + (x / y)); 
		} catch(Exception e) { 
			System.out.println("0으로 나눌 수 없습니다.");
		}
		
		sc.close();
	}

}
