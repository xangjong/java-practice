package ch07_Inheritance.sec06;

public class Computer extends Calculator {

	@Override
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areadCircle() 실행");
		return Math.PI * r *r;
	}

	

	

}
