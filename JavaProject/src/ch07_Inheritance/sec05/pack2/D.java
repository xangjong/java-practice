package ch07_Inheritance.sec05.pack2;

import ch07_Inheritance.sec05.pack1.AAA;

public class D extends AAA {

	// 다른 패키지에서는 public 접근 가능
	// 상속의 경우 protected 필드, 메소드 접근 가능
	// 자식 클래스라도 private 와 default 필드, 메소드는 접근 불가

		public D() {
			field1 = 1; //public O
			/*
			filed2 = 1;	 default X  
			field3 = 1;  private X 
			*/ 
			field4 = 1; // protected O
			
			method1(); // public o 
			// method2(); default x  
			// method3(); private x 
			method4(); // protected 
		}

}