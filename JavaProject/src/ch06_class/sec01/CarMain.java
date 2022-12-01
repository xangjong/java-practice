package ch06_class.sec01;

public class CarMain {

	public static void main(String[] args) {
		// 생성한 클래스 사용
		Car c1 = new Car(); // Car 클래스의 객체(참조 변수) 생성 
		Car c2= new Car();
		// c1.carNo = "11가1234";
		c1.selCarNo("11가1234");
		c1.showCarInfo();
		
		// c2.carNo ="22가5678";
		c2.selCarNo("22가5678");
		c2.showCarInfo();
	}

}
