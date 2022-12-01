package ch07_Inheritance.sec01;

public class Child extends Parent{
	private int c; 
	
	public void setChild() { 
		c=20;
	}
	
	public void showChild() {
		p=100;
		showParent();
		System.out.println("자식 클래스 : " + c);
	}
}
