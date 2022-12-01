package ch04_control_if_for.sec03;

public class ForNested1 {

	public static void main(String[] args) {
		// 종합 for문
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 5; j++)
				System.out.print(j + " ");
			System.out.println(); // 단순 줄바꿈
		}

		System.out.println("---------------");
		int count = 0;
		for (int x = 1; x <= 3; x++) {
			for (int y = 1; y <= 5; y++) {
				count++;
				System.out.print(count + "\t");
			} System.out.println();
		}
		
	}

}
