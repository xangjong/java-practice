package ch13_generic.sec05;

public class MultiGenMethodMain {

	public static void main(String[] args) {
		// 멀티 타입 제네릭 메소드 예제
		// (1) 호출할 때 구체적으로 타입 지정
		Pair<Integer, String> p1 = new Pair<Integer, String>(1, "사과");
		Pair<Integer, String> p2 = new Pair<Integer, String>(1, "사과");

		boolean result1 = Util.<Integer, String>compare(p1, p2);

		if (result1) {
			System.out.println("논리적으로 동등한 객체입니다.");
		} else {
			System.out.println("논리적으로 동등하지 않은 객체입니다.");
		}

		// (2) 타입 생략 : 매개값을 보고 구체적 타입 추정
		// "user1", "홍길동"
		// "user2", "홍길동"
		// p3, p4, result2
		Pair<String, String> p3 = new Pair("user1", "홍길동");
		Pair<String, String> p4 = new Pair("user2", "홍길동");
		boolean result2 = Util.compare(p3, p4); // <String, String> 생략
		if (result2) {
			System.out.println("논리적으로 동등한 객체입니다.");
		} else {
			System.out.println("논리적으로 동등하지 않은 객체입니다.");
		}
	}
}
