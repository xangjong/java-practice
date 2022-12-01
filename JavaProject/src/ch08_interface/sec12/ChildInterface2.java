package ch08_interface.sec12;

public interface ChildInterface2 extends ParentInterface {

	@Override
	public default void method2() {
		System.out.println("c2-m2()");
	}
	
	public void method3();
}
