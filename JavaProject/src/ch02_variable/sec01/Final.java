package ch02_variable.sec01;

public class Final {

	public static void main(String[] args) {
		// 상수 final 선언
		final double PI = 3.14159;
		
		// 변수 선언 및 초기화 
		double radius=10;
		double circleArea =0;
		
		//원의 넓이를 구해서 circleArea에 저장
		circleArea = radius * radius * PI;
		
		System.out.println("원의 넓이 : " + circleArea);
		
	}

}
