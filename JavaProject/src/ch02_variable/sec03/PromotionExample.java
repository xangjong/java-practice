package ch02_variable.sec03;

public class PromotionExample {

	public static void main(String[] args) {
		// 자동 타입 변환 : 작은 크기 -> 큰 크기로 타입 변환
		// byte -> int 
		byte byteValue = 10;
		int intValue = byteValue; // byte -> int 자동 타입 변환 발생
		
		System.out.println(intValue);
		
		// char -> int 
		char charValue ='가';
		intValue = charValue;
		
		System.out.println("가의 유니코드 : " + intValue);
		
		// int -> long
		intValue =500;
		long longValue = intValue;
		System.out.println(longValue);
		
		// int -> double
		intValue =200; 
		double doubleValue=intValue;
		System.out.println(doubleValue);
	}

}
