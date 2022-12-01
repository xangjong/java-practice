package ch05_reference_type.sec02;

public class Array4 {

	public static void main(String[] args) {
		// 배열 원소의 합 구하기
		int[] scores = { 83, 90, 87 };
		int sum = 0;

		// 배열 scores의 각 원소의 합과 평균을 구해서 출력
		for (int i = 0; i < scores.length; i++) {
			System.out.println("scores [" + i + "] : " + scores[i]);
			sum += scores[i];
		}
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + (float) sum / scores.length);
		// 출력 결과
		// 각 원소의 값
		// scores[0] : 83
		// ...
		// ...
		// 총합 : 260
		// 평균 : 86.666.....7

		System.out.println("-----------------------------");

		// (1) add() 메소드에 배열 전달 : 기존 배열 전달
		add(scores);

		System.out.println("-----------------------------");

		// (2) add() 메소드에 배열 전달 : 새로운 배열 만들어서 전달
		add(new int[] { 90, 77, 80 });

	}

	// 배열의 총합을 구해서 출력하는 메소드
	// 이름 : add
	// 배열을 전달 받아서 { } 안에 있는 작업 수행
	public static void add(int[] scores) { // scores 이외의 다른 변수명 사용 가능 : a,b, .... / 이 변수명으로 {} 안에서 사용
		int sum = 0;

		// 배열 scores의 각 원소의 합과 평균을 구해서 출력
		for (int i = 0; i < scores.length; i++) {
			System.out.println("scores [" + i + "] : " + scores[i]);
			sum += scores[i];
		}
		System.out.println("총합 : " + sum);
	}

}
