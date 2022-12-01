package ch08_interface.sec07;

public class Bus implements Vehicle {

	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}

}
