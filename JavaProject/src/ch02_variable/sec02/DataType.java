package ch02_variable.sec02;

public class DataType {

	public static void main(String[] args) {
		// 문자 타입 변수 선언 및 초기화
		
		char a = 'A'; // 문자 A
		char b = '\u0041'; // 문자 A의 유니코드 값
		char c = 65; // 문자 A의 아스키코드 값
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

		System.out.println("=================");
		
		//정수 타입 변수 선언 및 초기화 
		byte byteValue = 10; // 1 byte 정수
		short shortValue = 1000; // 2bye 정수
		int intValue = 2100100100; // 4 byte 정수
		long longValue = 10001000100100L; // 8byte 정수
		
		System.out.println("byteValue : " + byteValue);
		System.out.println("shortValue : " + shortValue);
		System.out.println("intValue : " + intValue);
		System.out.println("longValue : " + longValue);
		
		System.out.println("=================");
		//실수 타입 변수 선언 및 초기화
		// 기본 타입 : double 
		double doubleValue = 0.1234567890123456789; // 8 byte 실수 : 더 정밀함
		float floatValue = 0.1234567890123456789f; // 4 byte 실수 : f 안 붙이면 오류
		
		System.out.println("doubleValue : " + doubleValue );
		System.out.println("floatValue : " + floatValue);
		
		System.out.println("=================");
		
		// 지수 표현 : e 사용
		int var1 = 3000000; // 0이 6개 
		double var2 = 3e6; // 0이 6개 
		float var3= 3e6F; // float이므로 F 붙임
		double var4 =2e-3; // -3 : 소수점 이하 3자리 
		
		System.out.println("var1 : " + var1);
		System.out.println("var2 : " + var2);
		System.out.println("var3 : " + var3);
		System.out.println("var4 : " + var4);
		
		System.out.println("=================");

		//논리 타입 변수 선언 및 초기화
		
		boolean booleanValue = true;
		
		System.out.println("booleanValue :" + booleanValue );
		
		System.out.println("=================");

		// String 타입(문자열) 변수 선언 및 초기화 
		
		String address= "서울시 강남구 1번지";
		
		System.out.println("address : " + address);
	}

}

//대문자 A ~ 아스키 코드 값 : 65 ~ 
//소문자 a ~ 아스키 코드 값: 97~