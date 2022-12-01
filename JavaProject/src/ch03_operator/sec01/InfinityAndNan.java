package ch03_operator.sec01;

public class InfinityAndNan {

	public static void main(String[] args) {
		/*
		 정수를 0으로 나눌 경우
		System.out.println(10 / 0 );
		 예외 발생하고 실행 중단 및 프로그램 종료
		 */ 
		
		/*
		 0.0으로 나눌 경우 
		System.out.println(10 / 0.0 );
		Infinity
		*/
		
		/*
		 나머지 연산 % : 0으로 나눌 경우 
		System.out.println(10 % 0);
		예외 발생하고 실행 중단 및 프로그램 종료
		*/
		
		//나머지 연산 % : 0.0으로 나눌 경우 
		System.out.println(10 % 0.0);
		// Nan 출력 
		
	
	}

}
