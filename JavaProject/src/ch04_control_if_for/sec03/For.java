package ch04_control_if_for.sec03;

public class For {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) { // 반복 횟수 지정 : 10회 반복
			// 반복 수행되는 문장
			System.out.println(i);
		}
		// for 문 안에서 선언한 i는 for문 안에서만 사용 가능
		// for 문 밖에서는 사용 불가
		System.out.println("-------------");
		int j; // main()안에서 선언한 변수 : main() 내 모든 곳에서 사용 가능
		for (j = 1; j <= 10; j++) {
			System.out.println(j);
		}
		System.out.println("j : " + j);
		System.out.println("-------------");
		
		// 1~10 숫자의 합

		int x;
		int sum = 0; //더하기 연산에서 sum을 사용할 것이므로 반드시 초기화  
		for (x = 1; x <= 10; x++) {
			sum += x; //sum = sum + x

		}
		System.out.println("1 ~ "+ (x-1) +" 합 : " + sum);
		//처음 x 값이 11이 되어 있으므로 10까지 나오게 하기 위해서 -1 수행
	}
}
