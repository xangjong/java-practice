package ch09_nested.sec05;

public class Annoymous {
	RemoteControl field = new RemoteControl() {

		@Override
		public void turnOn() {
			System.out.println("Tv를 켭니다.");
		}

		@Override
		public void turnOff() {
			System.out.println("Tv를 끕니다.");
		}
	};

	void method1() {
		RemoteControl localVar = new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("Audio를 켭니다.");

			}

			@Override
			public void turnOff() {
				System.out.println("Audio를 끕니다.");

			}

		};
		localVar.turnOn();

	}

	void method2(RemoteControl rc) {
		rc.turnOn();
	}
}
