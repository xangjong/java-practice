package ch07_Inheritance.sec04;

public class Car {
	String carNum;
	String carName;
	String carprd;
	int carYear;

	public Car(String carNum, String carName, String carprd, int carYear) {
		super();
		this.carNum = carNum;
		this.carName = carName;
		this.carprd = carprd;
		this.carYear = carYear;
	}

	@Override
	public String toString() {
		return "차량 번호 : " + carNum + "\n차종 : " + carName + "\n제조자 : " + carprd + "\n연식 : " + carYear;
	}
}
