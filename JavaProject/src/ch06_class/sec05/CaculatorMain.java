package ch06_class.sec05;

public class CaculatorMain {

	public static void main(String[] args) {
		// static 멤버 사용 : 클래스명.멤버
		double result1=10 *10 * Caculator.pi;
		int result2 = Caculator.plus(10, 5);
		int result3 = Caculator.minus(10, 5);
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
	}

}
