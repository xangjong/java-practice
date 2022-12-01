package ch08_interface.sec12;

public class DefaultMethodMain {

	public static void main(String[] args) {
		// ChildInterface1을 구현하는 클래스를 생성하지 않고
		// 익명 구현 객체 사용해서 메소드 호출

		ChildInterface1 ci1 = new ChildInterface1() {

			@Override
			public void method1() {
				System.out.println("c1-m1()");
			}

			@Override
			public void method3() {
				System.out.println("c1-m3()");

			}

		};
		ci1.method1();
		ci1.method2(); // ParentInterface method2() 호
		ci1.method3();
		
		System.out.println();

		// (2) 디폴트 메소드를 재정의해서 실행 내용
		// 익명 구현 객체 사용
		ChildInterface2 ci2 = new ChildInterface2() {
			@Override
			public void method1() {
				System.out.println("c2-m1()");
			}

			@Override
			public void method3() {
				System.out.println("c2-m3()");
			}
		};

		ci2.method1();
		ci2.method2(); // ChildInterface2에서 재정의된 method2()호출
		ci2.method3();

		System.out.println();

		// (3) 디폴트 메소드를 추상 메소드로 재선언
		// 익명 구현 객체 사용
		ChildInterface3 ci3 = new ChildInterface3() {
			@Override
			public void method1() {
				System.out.println("c3-m1()");
			}

			@Override
			public void method2() {
				System.out.println("c3-m2()");
			}

			@Override
			public void method3() {
				System.out.println("c3-m3()");
			}
		};

		ci3.method1();
		ci3.method2();
		ci3.method3();
	}
}
