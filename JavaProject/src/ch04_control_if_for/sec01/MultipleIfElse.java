package ch04_control_if_for.sec01;

import java.util.Scanner;

public class MultipleIfElse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score;
		
		System.out.print("점수 입력(0~100) : ");
		score=sc.nextInt();
		
		if (score>=90) {
			System.out.println("A");
		}
		else if (score>=80) {
			System.out.println("B");
		}
		else if (score>=70) {
			System.out.println("C");
		}
		else if (score>=60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		
		sc.close();
	}

}
