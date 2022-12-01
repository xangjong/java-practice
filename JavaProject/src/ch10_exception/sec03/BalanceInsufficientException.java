package ch10_exception.sec03;

public class BalanceInsufficientException extends Exception{
	public BalanceInsufficientException() {} // 기본 생성
	
	
	
	// String 타입 매개변수를 갖는 생성자
	// 예외 발생 원인(예외 메세지)을 전달
	// 상위 클래스의 생성자를 호출하여 예외 메세지 전달
	// 예외 메세지 용도는 catch { } 블록의 예외 처리 코드에서 이용 
	public BalanceInsufficientException(String message) {
		super(message);
	}
	
}
