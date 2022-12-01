package ch04_control_if_for.sec06;

public class Break1 {

	public static void main(String[] args) {
		// break

		int i = 0;

		while (true) {
			i += 3; // 3씩 증가, 3의 배수
			if (i > 20)
				break;
			System.out.println(i);

		}

	}

}
