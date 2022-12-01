package ch07_Inheritance.sec03;

class A {
	public A() {
		System.out.println("기본생성자 A");
	}

	public A(int x) {
		System.out.println("매개변수가 있는 생성자 A : " + x);
	}
}

class B extends A {
	public B() {
		System.out.println("기본 생성자 B");
	}

	/*
	 * 자식 클래스 B 클래스의 생성자가 호출되면서
	부모 클래스의 생성자가 자동 호출 되는데 
	부모 클래스의 여러 개 생성자중 어느 생성자를 호출하겠다고 명시적으로 밝히지 않으면
	부모 클래스의 기본 생성자가 호출됨
	
	부모 클래스의 매개변수가 있는 성자를 출하려면 
	super() 를 사용해야함 
	*/
	public B(int x) {
		super(x);
		System.out.println("매개변수가 있는 생성자 B : " + x);
	}
}

public class Constructor2 {
	public static void main(String[] args) { 
		B b = new B(5);
	}
	
}
