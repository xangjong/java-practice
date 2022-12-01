package ch06_class.sec05;

public class InitValue {
	String name;
	int age;
	double score;
	boolean result;

	public void show() {
		// 메소드 내에 선언된 지역변수는 반드시 초기화 하고 사용해야 함
		// 초기화 하지 않으면 오류 발생
		String address = "서울";
		System.out.println(address);

		// 멤버 필드 : 기본값으로 자동 초기화됨 (0, 0.0, null, false)
		System.out.println(name);
		System.out.println(age);
		System.out.println(score);
		System.out.println(result);
	}
}
