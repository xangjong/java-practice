package ch08_interface.sec02;

public class Audio implements RemoteControl {
	private int volume;
	private boolean mute;

	// turnOn() : 추상 메소드 오버라이딩 : 실제 메소드
	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");

	}

	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다.");

	}

	@Override
	public void setVolume(int volume) {
		// static final 상수이므로 인터페이스 이름으로 사용
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 Audio 볼륨 : " + this.volume);
	}

	@Override
	public void setMute(boolean mute) {
		this.mute = mute;
		if (mute) {
			System.out.println("Audio 무음 처리합니다.");
		} else {
			System.out.println("Audio 무음 해합니다.");
		}
	}

}
