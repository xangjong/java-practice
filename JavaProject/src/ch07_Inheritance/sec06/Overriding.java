package ch07_Inheritance.sec06;

class Parent {
	private int x = 10;
	
	public void show() {
		System.out.println("Parent 클래스 x : " + x);
	}
}

class Child extends Parent{
	private int x = 20;
	
	public void show() {
		System.out.println("Child 클래스 x : " + x);
	}
}

public class Overriding {

	public static void main(String[] args) {
		Parent p = new Parent();
		p.show();
		
		Child c = new Child();
		c.show();
		
		Parent obP = new Child();
		obP.show();
	}

}









