package ch07_Inheritance.sec10;

public class HankookTire extends Tire {
	public HankookTire(int maxRotation, String location) {
		super(maxRotation, location);
	}

	@Override
	public boolean roll() {
		++accumulatedRotation;
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + " Tire 수행 : " + (maxRotation - accumulatedRotation));
			return true;
		} else {
			System.out.println("***" + location + "HanKookTire 펑크 *** ");
			return false;
		}
	}
}
