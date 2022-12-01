package ch03_operator.sec02;

import java.util.Scanner;

public class LogicalOperatorEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input; 
		
		System.out.print("문자 입력 : " );
		 input =sc.next().charAt(0);
		
		 
		 if ((input >=65) & (input <=90)){
			System.out.println("대문자");
		 }
		 
		 if ((input >=97) & (input <=122)){
				System.out.println("소문자");
			 }
		 
		 sc.close();
	}

}
