package ch07_Inheritance.sec07;

public class SportsCar extends MyCar {

	@Override
	public void speedUp() {
		speed += 10;
	}
	// final 메소드는 오버라이딩 할 수 없음
	/* 
	 @Override 
		public void stop() { 
		System.out.println("스포츠카 멈춤");
		spped=0;
	}*/
}
