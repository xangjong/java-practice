package ch06_class.sec05;

public class Caculator {
	// static 필드 선언
	// 일반적으로 static 필드는 선언과 동시에 초기값을 설정
	
	static double pi=3.13159;
	
	//static 메소드 
	
	static int plus(int x, int y) { 
		return x+y;
	}
	
	static int minus(int x, int y) { 
		return x-y;
	}
}
