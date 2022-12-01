package ch08_interface.sec03;

public class SmartRemoteControlMain {

	public static void main(String[] args) {
		// 인터페이스 변수 생성
		// 클래스 객체 대입해서 메소드 사용

		SmartTelevision tv = new SmartTelevision();
		
		RemoteControl rc = tv;
		
		rc.turnOn();
		rc.setVolume(10);
		rc.setVolume(0);
		rc.turnOff();
		
		Searchable sch = tv;
		sch.search("www.naver.com");
	}

}
