package ch04_control_if_for.sec03;

public class ForNestedEx {

	public static void main(String[] args) {
		for (int dan = 2; dan <= 9; dan++) {
			for (int i = 2; i <= 9; i++) {
				System.out.printf(i+ " x " + dan + " = " +(dan * i)+ " ");
			} System.out.println();
		}

	}

}
