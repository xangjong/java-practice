package ch06_class.sec11_Ex;

public class Computer {
	// 매개변수로 배열을 전달 받는 메소드
	public int sum1(int[] values) { 
		int sum1 =0;
		for(int i=0; i<values.length; i++) {
			sum1+=values[i]; }
		return sum1; 
	}
		// 매개변수로 가변 인자(...) 사용하는 메소드
		// 매개변수로 값의 리스트(여러 개의 값) 전달 받음
		// ... : 전달된 값의 수에 따라 자동으로 배열로 생성
		// 값을 2개 전달하면 원소가 2개인 배열 생성
		// 값을 3개 전달하면 원소가 3개인 배열 생성
	public int sum2(int... values) {
		int sum = 0;
		for (int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		return sum;

	}
}
