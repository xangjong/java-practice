package ch09_nested.sec05;

public class AnnoymousMain {

	public static void main(String[] args) {
		Annoymous annoy = new Annoymous();
		
		annoy.field.turnOn();
		annoy.method1();
		annoy.method2(
			new RemoteControl() {

				@Override
				public void turnOn() {
					System.out.println("SmartTv를 켭니다.");
				}

				@Override
				public void turnOff() {
					System.out.println("SmartTv를 끕니다.");
					
				}	
			}
				
		);
		
	}

}
