package ch04_control_if_for.sec08_ex;

public class Ex4 {
	public static void main(String[] args) {
		// 주사위 합 5이면 실행이 멈추는 코드
		int num1=0 , num2=0;
		while (num1 + num2 !=5) {
			num1 = (int) ((Math.random() * 6) + 1);
			num2 = (int) ((Math.random() * 6) + 1);
			System.out.println("(" + num1 + "," + num2 + ")");
		} 
	}

}
