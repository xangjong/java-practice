package ch07_Inheritance.sec02;

class A {
	public A() {
		System.out.println("생성자 A");
	}
}

class B extends A {
	public B() {
		System.out.println("생성자 B");
	}
}

class C extends B {
	public C() {
		System.out.println("생성자 C");
	}
}


public class Constructor {

	public static void main(String[] args) {
		C c = new C();

	}

}








