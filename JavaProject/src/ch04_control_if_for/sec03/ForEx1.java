package ch04_control_if_for.sec03;

public class ForEx1 {

	public static void main(String[] args) {
		int sum = 0;
		int i;
		for (i = 1; i <= 10; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
				sum += i;
			}

		}
		System.out.println("1~10 홀 수의 합 : " + sum);
		System.out.println("-------------");

		sum = 0;
		for (int j = 1; j <= 10; j++) {
			if (j % 2 != 0) {
				System.out.println(j);
				sum += j;
			}
		}
		System.out.println("1~10 홀 수의 합 : " + sum);
	}
}
