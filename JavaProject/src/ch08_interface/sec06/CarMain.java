package ch08_interface.sec06;

public class CarMain {

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.run();
		
		// 필드의 다형성 
		myCar.frontLeftTire = new KumhoTire();
		myCar.frontRightTire = new KumhoTire();
		
		myCar.run();
		
	}

}
