package ch06_class.sec04;

public class CarMain {

	public static void main(String[] args) {
		// this 레퍼런스 사용 예제 
		Car myCar = new Car("포르쉐");
		Car yourCar = new Car("벤츠");

		myCar.run();
		yourCar.run();
	}

}
