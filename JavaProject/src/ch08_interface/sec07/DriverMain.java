package ch08_interface.sec07;

public class DriverMain {

	public static void main(String[] args) {
		// 인터페이스의 매개변수 다형성 예제

		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		// 매개변수 다형성
		driver.drive(bus); // 자동 타입 변환 Vehicle vehicle = bus;
		driver.drive(taxi); // 자동 타입 변환 Vehicle vehicle = taxi; 
	}

}
