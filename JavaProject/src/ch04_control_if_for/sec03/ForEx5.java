package ch04_control_if_for.sec03;

import java.util.Scanner;

public class ForEx5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, score, total = 0;
		float avg = 0;
		System.out.print("학생 수 입력 : ");
		num = sc.nextInt();

		for (int i = 1; i <=num; i++) {
			System.out.print("학생" + i + " 점수 입력 : ");
			score=sc.nextInt();
			total+=score;
		}
		avg = total/(float)num;
		System.out.println("평균 : " + avg);

		sc.close();
	}

}
