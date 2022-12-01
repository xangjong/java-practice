package ch06_class.sec06;

public class Singleton {
	// 클래스 자신의 타입으로 static 필드 선언 
	// static 필드는 클래스당 한 개만 생성 가능 
	private static Singleton singleton= new Singleton();
	
	//외부에서 new 연산자로 생성자를 호출할 수 없도록 private 제한 
	private Singleton() { }
	
	//외부에서 호출할 수 있는 static 메소드 사용
	// static 필드에서 참조하고 있는 자신의 객체 리턴
	public static Singleton getInstance() { 
		return singleton;
	}
}
