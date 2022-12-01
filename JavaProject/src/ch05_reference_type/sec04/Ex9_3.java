package ch05_reference_type.sec04;

import java.util.Scanner;

public class Ex9_3 {

	public static void main(String[] args) {
		// Ex9
		Scanner sc = new Scanner(System.in);
		int input = 0, num, max = 0, sum = 0;
		float average;
		int[] scores = null;

		while (input != 5) {
			System.out.println("---------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("---------------------------------------------");
			System.out.print("선택> ");
			input = sc.nextInt();

			switch (input) {
			case 1:
				System.out.print("학생수> ");
				num = sc.nextInt();
				scores = new int[num];
				break;
			case 2:
				for (int i = 0; i < scores.length; i++) {
					System.out.print("scores[" + i + "] : ");
					scores[i] = sc.nextInt();
					sum += scores[i];
					if (max < scores[i])
						max = scores[i];
				}
				break;
			case 3:
				for (int i = 0; i < scores.length; i++)
					System.out.println("scores[" + i + "] : " + scores[i]);
				break;
			case 4:
				average = sum / (float) scores.length;
				System.out.println("최고 점수 : " + max);
				System.out.println("평균 점수 : " + average);
				break;
			case 5:
				break;
			default:
				System.out.println("잘못 입력했습니다. 다시 입력해주세요");
			}

		}
		System.out.println("프로그램 종료");

		sc.close();
	}

}