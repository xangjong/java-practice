package ch07_Inheritance.sec05.pack1;

// 클래스 내부에서 접근 제한과 상관없이 모든 필드와 메소드 사용 가능 
public class AAA {
	public int field1; // public 접근 제한
	int field2; // default 접근 제한
	private int field3; // private 접근 제한
	protected int field4; // protected 접근 제한 

	public AAA() {
		field1 = 1; // (O) 클래스 내부 : 접근 제한 없음
		field2 = 1; // (O) 클래스 내부 : 접근 제한 없음
		field3 = 1; // (O) 클래스 내부 : 접근 제한 없음
		field4 = 1; // (O) 클래스 내부 : 접근 제한 없음
	
	}

	public void method1() {} // public 접근 제한 
	void method2() {} // default 접근 제한
	private void method3() {} //private 접근 제한
	protected void method4() {} // protected 접근 제한

}
