package ch07_Inheritance.sec10;

public class KumhoTire extends Tire {
	public KumhoTire(int maxRotation, String location) {
		super(maxRotation, location);
	}

	@Override
	public boolean roll() {
		++accumulatedRotation;
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + " Tire 수행 : " + (maxRotation - accumulatedRotation));
			return true;
		} else {
			System.out.println("***" + location + "KumhoTire 펑크 *** ");
			return false;
		}
	}
}
