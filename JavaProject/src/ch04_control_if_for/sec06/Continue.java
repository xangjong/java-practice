package ch04_control_if_for.sec06;

public class Continue {

	public static void main(String[] args) {
		// Continue
		//홀수인 경우 다음 문장 건너뛰고 다음 번에 계속 
		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0) {
				continue;
			}
			System.out.println(i);
		}
	}

}
