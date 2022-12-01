package ch08_interface.sec12;

public interface ChildInterface3 extends ParentInterface {
	@Override
	public void method2() ; // default 제거하고 추상 메소드로 재선언
	public void method3();
}
