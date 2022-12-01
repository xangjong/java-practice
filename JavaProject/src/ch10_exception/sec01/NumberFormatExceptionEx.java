package ch10_exception.sec01;

public class NumberFormatExceptionEx {

	public static void main(String[] args) {
		String data1="100"; // 문자열 100 
		
		// 문자열 "100"을 숫자로 변환 
		// 숫자 형태로 되어 있는 문자열은 숫자로 타입 변환이 가능 
		int value1 = Integer.parseInt(data1); // 예외 발생 없음 
		System.out.println(value1);
		
		// 숫자에 문자가 섞여 있는 경우 숫자로 타입 변환시 예외 발생 :  NumberFormatException
		String data2 ="a100";
		int value2 = Integer.parseInt(data2); // 예외 발생하고 프로그램 종료
		// 이후 코드 수행 안 함
		
	}
}

