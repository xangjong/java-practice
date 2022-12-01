package ch12_thread.sec05;

public class ThreadPriorityMain {

	public static void main(String[] args) {
//		스레드 우선 순위 예제
//		우선 순위 설정 
		for (int i = 1; i <= 10; i++) {
			Thread thread = new CalcThread("thread" + i);
			if (i != 10) {
				thread.setPriority(Thread.MIN_PRIORITY);
			} else {
				thread.setPriority(Thread.MAX_PRIORITY);
			}
			thread.start();
		}
	}

}
