package ch03_ex;

import java.util.Scanner;

public class WhileEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("숫자 입력 : ");
		num =sc.nextInt();
		
		while(num!=7) {
			System.out.print("다시 입력 : ");
			num =sc.nextInt();
		} System.out.println(num + "입력. 종료");
		

	}

}
