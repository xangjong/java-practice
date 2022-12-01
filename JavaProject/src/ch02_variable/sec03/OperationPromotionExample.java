package ch02_variable.sec03;

public class OperationPromotionExample {

	public static void main(String[] args) {
		// 연산식에서 자동 타입 변환
		// 정수 연산인 경우 : int 타입이 기본(4 byte)
		// 4 byte 보다 작은 타입(byte, char, short)은 int 타입으로 변환된 후 연산 수행
		
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		
		// int 타입으로 변환된 후 연산 결과 int 타입으로 byte 타입에 저장할 수 없음
		
		int intValue1  = byteValue1 + byteValue2;
		System.out.println(intValue1);
		
		// int 타입 / int 타입 
		// 즉, 정수 나누기 정수 결과는 정수 
		// 실수 결과를 원하면 실수 연산을 수행해야함

		int intVal1 =10;
		int intVal2  = intVal1 /4;
		System.out.println(intVal2); //2.5가 아닌 2 출력
		
		// 실수 연산 : 정수 / 실수
		// intVal1 / 4 : 정수 연산 
		// intVal1 / 4.0 : 실수 연산
		double doubleVal = intVal1 / 4.0; // 2.5  
		System.out.println(doubleVal);
		 
		
	}

}
