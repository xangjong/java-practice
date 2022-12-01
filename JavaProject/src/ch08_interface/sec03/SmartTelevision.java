package ch08_interface.sec03;

public class SmartTelevision implements RemoteControl, Searchable {
	private int volume;
	
	// Searchable 인터페이스의 추상 메소드에 대한 실제 메소드 
	@Override
	public void search(String url) {
		System.out.println(url + "를 검색합니다.");
	}

	
	// RenoteControl 인터페이스의 추상 메소드에 대한 실제 메소드 
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");

	}

	@Override
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨 : " + this.volume);
	}

}
