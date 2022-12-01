package ch08_interface.sec11;

public interface MyInterface {
	public void method1();
	
	// 기존 인터페이스에 새로운 메소드 추가
	// 추상 메소드로 추가하게되면 기존 인터페이스를 구현한 MyClassA에서 무조건 재정의 해야함(필요없어도 해야함, 안 하면 오류)
	// default 메소드로 추가해서 선택하여 사용하게 함(필수 아님)
	
	public default void method2() { 
		System.out.println("MyInterface-method2() 실행");
	}
}
