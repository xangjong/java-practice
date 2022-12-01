package ch04_control_if_for.sec03;

import java.util.Scanner;

public class ForEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dan, i;
		System.out.print("단 수 입력 : ");
		dan = sc.nextInt();
		sc.close();

		for (i = 1; i <= 9; i++) {
			System.out.println(dan + " x " + i + " = " + dan * i);
		}

	}

}
