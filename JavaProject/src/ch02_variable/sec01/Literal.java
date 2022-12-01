package ch02_variable.sec01;

public class Literal {

	public static void main(String[] args) {
		
		// 리터럴 
		int score = 95; // 95:정수 리터럴
		double average= 88.5; // 실수 리터럴
		char familyName = '김'; // 문자 리터럴
		String name = "홍길동"; //문자열 리터럴
		boolean result = true; // 논리 리터럴
		
		System.out.println(score);
		System.out.println(average);
		System.out.println(familyName);
		System.out.println(name);
		System.out.println(result);
		
		//문자열 리터럴 안에 특수문자 포함 가능 
		System.out.println("탭만큼 이동 \t 합니다");
		System.out.println("한 줄 내려 쓰기 \n합니다.");
	}

}
