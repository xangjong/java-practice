package ch06_class.sec08;

import ch06_class.sec01.Car;

public class NewClass {

	public static void main(String[] args) {
		//같은 패키지의 다른 java 파일에서 만든 클래스 사용 
		Add add = new Add(1,5);
		add.caculate();
		
		//다른 패키지에 있는 클래스 사용 
		// import 패키지명.클래스명
		// import ch06_class.sec01.Car;
		Car c1 = new Car();
		c1.selCarNo("11가1234");
		c1.showCarInfo();
		
	}

}
