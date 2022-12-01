package ch06_class.sec04;

public class Car {
	String model;
	int speed;
	public Car(String model) { 
		this.model =model;  // this 필드 (매개변수 필드명과 같은 경우) 사용
	}
	public void setSpeed(int speed) { 
		this.speed=speed;
	}
	public void run() { 
		for(int i=10; i<=50; i+=10) { 
			this.setSpeed(i);
			System.out.println(model + "가 달립니다(시속 : "
					+ speed + "km/h)"); 
			// 매개변수 없는 경우 필드명에 this 안 붙여도 됨 
		}
	}
}
