package ch07_Inheritance.sec04;

public class Automobile extends Car {
	String autoManual;

	public Automobile(String carNum, String carName, String carprd, int carYear, String autoManual) {
		super(carNum, carName, carprd, carYear);
		this.autoManual = autoManual;
	}

	@Override
	public String toString() {
		return super.toString() + "\n기어 변솔 : " + autoManual;
	}

}
