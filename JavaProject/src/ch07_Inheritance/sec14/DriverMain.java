package ch07_Inheritance.sec14;

public class DriverMain {

	public static void main(String[] args) {
		// 매개변수 다형성 예제 
		Driver driver = new Driver();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus);
		driver.drive(taxi);
	}

}
