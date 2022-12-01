package ch05_reference_type.sec04;

public class Ex7 {

	public static void main(String[] args) {
		int max = Integer.MIN_VALUE;
		int[] array = { 1, 5, 3, 8, 2 };
		for (int i : array) {
			max = (i > max) ? i : max;
		}
		System.out.println("Integer.MIN_VALUE : " + Integer.MIN_VALUE);

	}
}
