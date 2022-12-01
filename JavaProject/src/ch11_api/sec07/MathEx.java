package ch11_api.sec07;

public class MathEx {

	public static void main(String[] args) {
		// Math 클래스 예제
		System.out.println(Math.abs(-5));
		System.out.println(Math.ceil(5.3)); // 올림 6.0
		System.out.println(Math.floor(5.3)); // 내림 5.0

		System.out.println(Math.max(5, 9));
		System.out.println(Math.max(5.3, 2.5));
		
		System.out.println(Math.min(5, 9));
		System.out.println(Math.min(5.3, 2.5));
		
		System.out.println(Math.random()); // 0~1.0 사이의 수
		
		System.out.println(Math.rint(5.3)); // 5.0 (가까운 정수의 상수값)
		System.out.println(Math.rint(5.7)); // 6.0 
		System.out.println(Math.rint(5.5)); // 6.0 
		
		System.out.println(Math.round(5.3)); // 5
		System.out.println(Math.round(5.7)); // 6 
		System.out.println(Math.round(5.5)); // 6 
		
		
	}

}
