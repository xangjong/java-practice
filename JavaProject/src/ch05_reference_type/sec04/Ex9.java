package ch05_reference_type.sec04;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int scores[] = null;

		Outer: while (true) {

			System.out.println("------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("------------------------------------------------");
			System.out.print("선택> ");

			switch (sc.nextInt()) {
			case 1:
				System.out.print("학생수> ");
				scores = new int[sc.nextInt()];
				break;
			case 2:
				for (int i = 0; i < scores.length; i++) {
					scores[i] = sc.nextInt();
				}
				break;
			case 3:
				for (int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "] : " + scores[i]);
				}
				break;
			case 4:
				int sum = 0, max = 0;
				for (int i : scores) {
					sum += i;
					max = (i > max) ? i : max;
				}
				System.out.println("최고 점수 : " + max);
				System.out.println("평균 점수 : " + 1.0 * sum / scores.length);
				break;
			case 5:
				break Outer;
			}
		}

		System.out.println("프로그램 종료");
		sc.close();

	}

}
