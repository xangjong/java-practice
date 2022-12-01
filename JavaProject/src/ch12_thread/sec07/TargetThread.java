package ch12_thread.sec07;

public class TargetThread extends Thread {

	@Override
	public void run() {
		for (long i = 0; i < 1000000000; i++) {}
	//	 실행 대기 상태 또는 실행 상태
		try {
			Thread.sleep(1500); // 1.5
		} catch (InterruptedException e) {

		}
		
		for (long i = 0; i < 1000000000; i++) {} 
		// 종료되면 스레드 종료 상태 : TERMINATED

	}
}
