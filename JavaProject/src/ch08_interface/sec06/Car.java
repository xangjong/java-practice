package ch08_interface.sec06;

public class Car {
	// 인터페이스 타입 필드 선언 
	// 초기 구현 객체 대입 
	
	Tire frontLeftTire = new HankookTire();
	Tire frontRightTire = new HankookTire();
	Tire backLeftTire = new HankookTire();
	Tire backRightTire = new HankookTire();
	
	void run() { 
		// 인터페이스에 선언된 roll() 메소드 호출 
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}
}