package ch06_class.sec02;

public class Calculator {
	public void powerOn() {
		System.out.println("전원을 켭니다");
	}

	public void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	//정수 2개를 전달 받아서 , 더한 결과를 반환 
	//반환값(더한 결과)의 데이터 타입이 정수 타입(int)
	public int plus(int x, int y) { 
		int result = x+y;
		return result; // return x+y;
	}
	//정수 2개를 전달 받아서 실수 연산으로 더한 결과를 반환 
	//반환값(더한 결과)의 데이터 타입이 실수 타입(double)
	public double divide(int x, int y) { 
		double result = (double)x / (double)y;
		return result;
	}
}
