package ch04_control_if_for.sec07;

import java.util.Random;
import java.util.Scanner;

public class RandomEx {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);

		int ran = r.nextInt(10) + 1; // 랜덤숫자 생성
		int num; // 숫자 입력값

		System.out.println("----------------");
		System.out.println("어떤 숫자일까요? 알아 맞춰보세요^^(1~10)");

		System.out.print("숫자 입력 : ");
		num = sc.nextInt();

		while (ran != num) {
			System.out.print("아닙니다. 다시 맞춰보세요^^ : 다시 입력 :");
			num = sc.nextInt();
		}
		System.out.print("드디어 맞췄습니다~ 나의 숫자는 " + num + "입니다.");
		System.out.println("*************");
		sc.close();
	}

}
