package ch07_Inheritance.sec07;

public class MyCar {
	public int speed; 
	
	public void speedUp() { 
		speed +=1; 
	} 
	// final 메소
	public final void stop() { 
		System.out.println("자동 멈춤");
		speed=0;
	}
}
