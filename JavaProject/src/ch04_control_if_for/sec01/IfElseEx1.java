package ch04_control_if_for.sec01;

import java.util.Scanner;

public class IfElseEx1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score;
		
		System.out.print("정수 입력 : ");
		score=sc.nextInt();
		
		if ((score % 2) == 0) { 
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
		
		sc.close();
	}

}
