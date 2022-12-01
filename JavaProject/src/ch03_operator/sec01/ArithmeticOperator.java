package ch03_operator.sec01;

import java.util.Scanner;

public class ArithmeticOperator {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int x, y;
		
		
		System.out.print("정수 1 입력 : " );
		x = sc.nextInt();
		System.out.print("정수 2 입력 : " );
		y = sc.nextInt();
		
		System.out.println("덧셈 : " + (x + y) );
		System.out.println("뺄셈 : " + (x - y));
		System.out.println("곱셈 : " + (x * y));
		System.out.println("나눗셈 : " + (x / y));
		System.out.println("나머지 : " + (x % y));
		
		sc.close();
	}

}
