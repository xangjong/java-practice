package ch08_interface.sec08;

public class VehicleMain {

	public static void main(String[] args) {
	// 인터페이스에서 강제 타입 변환 예제
		
	Vehicle vehicle = new Bus();
	//vehicle은 Vehicle 인터페이스 타입이므로 
	// 인터페이스의 메소드만 사용 가능 
	vehicle.run();
	
	// Vehicle 인터페이스에는 CheckFare()가 없음
	// checkFare()는 Bus 클래스의 멤버메소드
	// vehicle.checkFare(); 사용 불가
	
	// vehicle의 Bus 클래스의 메소드 checkFare()를 사용할 수 있도록
	// 강제 타입 변환 
	
	Bus bus = (Bus)vehicle; // 강제 타입 변 
	bus.run();
	bus.checkFare();
	}
}
