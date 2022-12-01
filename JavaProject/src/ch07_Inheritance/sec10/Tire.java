package ch07_Inheritance.sec10;

public class Tire {
	public int maxRotation; // 최대 회전 수 (최대 수행)
	public int accumulatedRotation; // 누적 회전 수
	public String location; // 타이머 위치

	public Tire(int maxRotation, String location) {
		this.maxRotation = maxRotation;
		this.location = location;
	}

	public boolean roll() {
		++accumulatedRotation;
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + " Tire 수행 : " + (maxRotation - accumulatedRotation));
			return true;
		} else {
			System.out.println("***" + location + "Tire 펑크 *** ");
			return false;
		}
	}
}
