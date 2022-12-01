package ch03_operator.sec02;

public class CompareOperator1 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;

		boolean result1 = (num1 == num2);
		boolean result2 = (num1 != num2); 
		boolean result3 = (num1 <= num2);
		
		System.out.println("result1 : " + result1 );
		System.out.println("result2 : " + result2 );
		System.out.println("result3 : " + result3 );
		
		//문자 비교 연산
		char ch1 = 'A';
		char ch2 = 'B';
		
		boolean result4 = (ch1 < ch2);
		System.out.println("result4 : "+ result4);
		
		System.out.println("A의 아스키 코드 값 : " + (int)ch1);
		System.out.println("B의 아스키 코드 값 : " + (int)ch2);
		
	}

}
