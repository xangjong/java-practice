package ch08_interface.sec10;

public class InterfaceMain {

	public static void main(String[] args) {
		// 인터페이스 다중 상속 예제
		
	ImplementationC impl = new ImplementationC();
	
	InterfaceA ia = impl;
	ia.methodA(); // InterfaceA 변수는 methodA()만 호출 가능 
	
	System.out.println();
	
	InterfaceB ib = impl;
	ib.methodB(); // InterfaceB 변수는 methodB()만 호출 가능
	
	System.out.println();

	
	InterfaceC ic = impl; // Interface 변수
	ic.methodA(); // methodA(), methodB(), methodC() 모두 사용 가능
	ic.methodB();
	ic.methodC();
	}

}
