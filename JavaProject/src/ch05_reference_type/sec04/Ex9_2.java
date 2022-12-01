package ch05_reference_type.sec04;

import java.util.Scanner;

public class Ex9_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, cnt = 0; // 선택, 학생수 변수
		int[] scores = new int[0]; // 배열 초기화
		boolean chk = true;

		// 출력
		while (chk) {
			System.out.println("----------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("----------------------------------------------");
			System.out.print("선택> ");
			num = sc.nextInt();

			switch (num) {
			case 1:
				System.out.print("학생수> ");
				cnt = sc.nextInt();
				break;
			case 2:
				scores = new int[cnt];
				System.out.println(cnt);
				for (int i = 0; i < cnt; i++) {
					System.out.print("scores[" + i + "] : ");
					scores[i] = sc.nextInt();
				}
				break;
			case 3:
				for (int i = 0; i < cnt; i++)
					System.out.println("scores[" + i + "] : " + scores[i]);
				break;
			case 4:
				int max = 0, sum = 0;
				float avg = 0.0F;
				for (int i = 0; i < cnt; i++) {
					max = (max < scores[i]) ? scores[i] : max;
					sum += scores[i];
				}
				avg = sum / (float) cnt;
				System.out.println("최고 점수 : " + max);
				System.out.println("평균 점수 : " + avg);
				break;
			default:
				chk = false;
				System.out.println("종료합니다.");
			}
		}

		sc.close();
	}

}