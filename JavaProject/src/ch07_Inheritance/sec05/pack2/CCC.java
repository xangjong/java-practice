package ch07_Inheritance.sec05.pack2;

import ch07_Inheritance.sec05.pack1.AAA;

// 다른 패키지에서는 public만 접근 가능 

public class CCC {
	public CCC() {

		AAA a = new AAA(); // import : ctrl + shift + o

		a.field1 = 1; // public o
		/*
		a.field2 = 1; default x
		a.field3 = 1; private x
		a.field4 = 1; protected x 
		*/

		a.method1(); // public o 
		/*
		a.method2(); default x
		a.method3(); private x
		a.method4(); protected x 
		*/
	}
}
