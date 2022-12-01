package ch07_Inheritance.sec06;

public class SuperAirplaneMain {

	public static void main(String[] args) {
		// 오버라이딩 - 부모 메소드 호출 (super 사용) 예제
		
		SuperAirplane sa = new SuperAirplane();
	
		sa.takeOff();
		sa.fly();
		sa.flyMode = SuperAirplane.SUPERSONIC;
		sa.fly();
		sa.flyMode = SuperAirplane.NORMAL;
		sa.fly();
		sa.land();
	}

}
