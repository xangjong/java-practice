package ch07_Inheritance.sec11;

public class Car {
	
	// 객체 배열 사용
	Tire[] tires = {
			 new Tire(6, "앞 왼쪽"), 
			 new Tire(2, "앞 오른쪽"), 
			 new Tire(3, "뒤 왼쪽"),
			 new Tire(4, "뒤 오른쪽")
	}; 	
	
	
	public int run() {
		System.out.println("[자동차가 달립니다.]");
		
		for(int i=0; i<tires.length; i++) {
			if(tires[i].roll() == false) {
				stop();
				return (i+1);
			}
		}		
		
		return 0;
	}
	
	void stop() {
		System.out.println("[자동차가 멈춥니다.]");
	}
}