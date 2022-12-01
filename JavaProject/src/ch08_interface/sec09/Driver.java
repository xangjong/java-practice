package ch08_interface.sec09;

public class Driver {
	public void drive(Vehicle vehicle) {
		// vehicle 매개변수가 참조하는 객체가 Bus 객체인지 조사해서
		// Bus 객체인 경우 안전하게 강제 타입 변환
		// instanceof 연산자 사용해서 타입 확인

		if (vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle;
			bus.checkFare();
		}
		
		vehicle.run();
	}
}
