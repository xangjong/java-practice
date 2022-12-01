package ch12_thread.sec02;

import java.awt.Toolkit;

// 작업 스레드 : 비프음 출력
public class BeepThread extends Thread {

	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			}
		}

	}

}
