package ch07_Inheritance.sec05.pack1;

// 동일 패키지 내에서는 private 필드와 메소드를 제외한 
// 다른 필드와 메소드 접근 가능 


public class BBB {
	public BBB() { 
		AAA a = new AAA();
		
		a.field1 =1; // public 사용 가능 
		a.field2 =1; // default 사용 가능
		// a.field3 = 1; private 사용 불가 
		a.field4 = 1; // protective 사용 가능 
		
		a.method1(); //public 
		a.method2(); // default
		// a.method3(); private  
		a.method4(); // protected
	}
}
