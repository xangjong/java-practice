package ch04_control_if_for.sec06;

public class Break2_2 {

	public static void main(String[] args) {
		// 중첩된 반복문에서 break문 사용
		// 대문자 -> 소문자
		Outter : for (char upper = 'A'; upper <= 'Z'; upper++) { // 대문자 A-Z
			for (char lower = 'a'; lower <= 'z'; lower++) {
				System.out.println(upper + "-" + lower);

				// 소문자 g인 경우 프로그램 중단
				if (lower == 'g')
					break Outter;
				
				//바깥 for문 중단 : 이름을 Outter로 붙이고 break Outer; 해서 중단
			}

		}
		System.out.println("프로그램 실행 종료");
	}

}
