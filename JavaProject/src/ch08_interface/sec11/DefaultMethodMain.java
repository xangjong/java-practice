package ch08_interface.sec11;

public class DefaultMethodMain {

	public static void main(String[] args) {
		//디폴트 메소드 새로 추가하는 예
		MyInterface mi1 = new MyClassA();
		mi1.method1();
		mi1.method2(); // MyInterface의 메소드 호출 
		
		MyInterface mi2 = new MyClassB();
		mi2.method1();
		mi2.method2(); //재정의된 메소드 호출 
		
	}

}
