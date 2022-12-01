package ch07_Inheritance.sec11;

public class CarMain {

	public static void main(String[] args) {
		// 다형성 예제
		Car car = new Car();

		for (int i = 1; i <= 5; i++) {
			int problemLocation = car.run();

			if (problemLocation != 0) {
				if (i == 2) {
					System.out.println(car.tires[problemLocation - 1].location + " KumhoTire로 교체");
				} else {
					System.out.println(car.tires[problemLocation - 1].location + " HankookTire로 교체");
				}

				car.tires[problemLocation - 1] = new HankookTire(15, car.tires[problemLocation - 1].location);
			}

			System.out.println("-----------------------------------------------");
		}
	}
}