package ch08_interface.sec12;

public interface ParentInterface {
	public void method1();
	
	public default void method2(){ 
		System.out.println("P-m2()");
	}

	void method3();
}
