package ch07_Inheritance.sec15;

public class Dog extends Animal {
	public Dog() {
		this.kind = "포유류"; // super, animal, kind도 가능
	}

	// 추상 메소드 오버라이딩 (재정의)
	@Override
	public void sound() {
		System.out.println("멍");
	}
	// 변환 추상 메소드를 오버라이딩 하지 않으면 오류 
}
