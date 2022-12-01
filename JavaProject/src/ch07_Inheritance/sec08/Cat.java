package ch07_Inheritance.sec08;

public class Cat extends Animal {

	@Override
	public void show() {
		System.out.println("고양이입니다.");
	}

	public void getCat() {
		System.out.println("Cat 클래스 메소드 ");
	}
}
