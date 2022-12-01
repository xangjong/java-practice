package ch11_api.sec04;

import java.util.concurrent.TimeUnit;

public class SystemTimeEx {

	public static void main(String[] args) {
		long time1 = System.currentTimeMillis();
		System.out.println(time1);
		
		// 시작 지점
		long time2 = System.nanoTime();
		System.out.println(time2);
		
		// 연산 작업 수행
		
		int sum =0; 
		for(int i=1; i<=1000000; i++) {
			sum+=i;
		}
		
		// 종료 시점
		long time3 = System.nanoTime();
		System.out.println(time3);
		
		System.out.println("1~1000000까지의 합 : "+ sum);
		System.out.println("계산액 " + (time3 - time2) + " 나노초가 소요되었습니다.");
		
		// 밀리/나노 초 변환
		
		long milliSeconds = TimeUnit.MILLISECONDS.toMillis(time2);
		System.out.println(milliSeconds);
		
		long nanoSeconds = TimeUnit.NANOSECONDS.toNanos(time1);
		System.out.println(nanoSeconds);
		
		
		
		
	}

}
