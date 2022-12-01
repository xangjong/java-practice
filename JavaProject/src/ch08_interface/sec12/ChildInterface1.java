package ch08_interface.sec12;

public interface ChildInterface1 extends ParentInterface {
	public void method3();
}


// ChildInterface1 인터페이스를 구현하는 클래스는
// method1()과 method3()의 실제 메소드를 재정의해야함 
// ParentInterface로 메소드 호출 