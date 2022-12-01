package ch12_thread.sec01;

import java.awt.Toolkit;

public class BeepPrintEx {

	public static void main(String[] args) {
		// 메인 스레드만 있는 예제
		Toolkit toolkit = Toolkit.getDefaultToolkit();

		
		// 비프음 5번 연속 출력
		for (int i = 0; i < 5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			}

		}
		
		// 띵 5번 연속 출력
		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			}
		}
	}
}
