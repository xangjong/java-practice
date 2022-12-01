package ch02_variable.sec03;

public class CastingExample {

	public static void main(String[] args) {
		// 강제 타입 변환 : 큰 크기 타입 -> 작은 크기 타입
		// (변환하고자 하는 타입)
		
		// int -> char 
		
		int intValue =44032;
		char charValue=(char)intValue;
		System.out.println(charValue);
		
		// long -> int 
		
		long longValue =500;
		intValue=(int)longValue;
		System.out.println(intValue);
		
		long longValue2 = 210000000000L; // int 값의 범위를 벗어나는 경우 L 붙임
		intValue=(int)longValue2;
		System.out.println(longValue2);

		// double -> int 
		double doubleValue = 3.14;
		intValue=(int)doubleValue; // 소수점 이하 값 잘림(실수를 정수로 변환) 
		System.out.println(intValue);
				
	}

}
