package ch07_Inheritance.sec10;

public class CarMain {

	public static void main(String[] args) {
		// 다항성 예
		Car car = new Car();

		for (int i = 1; i <= 5; i++) {
			int problemLocation = car.run();
			switch (problemLocation) {
			case 1:
				System.out.println("앞 왼쪽 HankookTire로 교체 ");
				car.frontLeftTire = new HankookTire(15, "앞 왼쪽");
				break;
			case 2:
				System.out.println("앞 오른쪽 KumhoTire로 교체 ");
				car.frontRightTire = new HankookTire(13, "앞 오른쪽");
				break;
			case 3:
				System.out.println("뒤 왼쪽 HankookTire로 교체 ");
				car.backLeftTire = new HankookTire(14, "뒤 왼쪽");
				break;
			case 4:
				System.out.println("뒤 오른쪽 KumhoTire로 교체 ");
				car.backRightTire = new HankookTire(17, "뒤 오른쪽");
				break;
			}
			System.out.println("---------------");
		}
	}

}
