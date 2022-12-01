package ch04_control_if_for.sec08_ex;

public class Ex5 {

	public static void main(String[] args) {
		// 중첩 for문을 이용한 방정식 4x +5y=60의 모든 해를 구하여
		// (x,y)형태 출력 x,y는 10 이하 
		int x=1, y=1;
		for(x=1; x<=10; x++) {
			for(y=1; y<=10; y++) { 
				if((4 * x) + (5 * y) == 60) { 
				System.out.println("(" + x + "," + y + ")");
				}
			}
		}

			
	}
}
