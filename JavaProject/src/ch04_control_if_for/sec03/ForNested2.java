package ch04_control_if_for.sec03;

public class ForNested2 {

	public static void main(String[] args) {
		// 종합 for문
		for (int dan = 2; dan <= 9; dan++) {
			System.out.println(dan + " 단");
			for (int i = 1; i <= 9; i++)
				System.out.println(dan + " x " + i + " = " + (dan * i));
		}
	}

}
