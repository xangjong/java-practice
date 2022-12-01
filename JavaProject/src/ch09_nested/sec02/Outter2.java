package ch09_nested.sec02;

public class Outter2 {
	String field = "Outter-field";
	
	void method() {
		System.out.println("Outter-method");
	}
	
	
	class Nested{
		String field = "Nested-field";
	
		void method() { 
			System.out.println("Nested-method");
		}
		
		void print() {
			// 중첩 객체 참조
			System.out.println(this.field);
			this.method();
			
			// 바깥 객체 참조 : 바깥 클래스 . this . 멤버
			System.out.println(Outter2.this.field);
			Outter2.this.method();
		}
	}
	
	
}
