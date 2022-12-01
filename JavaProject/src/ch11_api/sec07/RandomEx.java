package ch11_api.sec07;

import java.util.Random;

public class RandomEx {

	public static void main(String[] args) {
//	Random 클래스 예제

		/*		
		 * 실행할 때마다 다른 난수 생성
		Random r = new Random();		
		for(int i=1; i<=5; i++) {
		System.out.print(r.nextInt(10) + i + " ");
			}
			} */

//		 seed 값 설정 : 실행할 때마다 동일한 난수 생성
		Random r = new Random(3);

		for (int i = 1; i <= 5; i++) {
			System.out.print(r.nextInt(10) + i + " ");
		}
	}

}
