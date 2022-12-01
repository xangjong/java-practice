package ch07_Inheritance.sec15;

public abstract class Animal { // 추상 클래스
	public String kind;

	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}

	// 추상 메소드 선언
	public abstract void sound();
	// public void sound2(); abstract를 안 붙이면 body가 없다는 오류

}
