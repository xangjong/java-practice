package ch08_interface.sec02;

public class RemoteControlMain {

	public static void main(String[] args) {
		// 인터페이스 생성 예제 
		
		// 인터페이스 변수 선언 
		RemoteControl rc = null;
		
		// Television 객체를 인터페이스 타입에 대입 
		rc = new Television();
		rc.turnOn();
		rc.setVolume(10);
		rc.setMute(true);
		rc.setMute(false);
		rc.turnOff();
		System.out.println("----------");
		
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(10);
		rc.setMute(true);
		rc.setMute(false);
		rc.turnOff();
		
		// 정적 메소드 사용 
		RemoteControl.changeBattery();
	}

}
