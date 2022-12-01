package ch07_Inheritance.sec09;

public class Child extends Parent {
	String field2;
	
	public void method3() { 
		System.out.println("Parent-method3()");
	}

	@Override
	public void method4() {
		super.method4();
	} 
	
	

}
