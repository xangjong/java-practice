package ch07_Inheritance.sec09;

public class ParentChildMain {

	public static void main(String[] args) {
		// 자동 타입 변환 , 강제 타입 변환 예제

		Parent p = new Child(); // 부모 타입으로 자동 타입 변환

		// 부모 타입의 멤버만 사용 가능
		p.field1 = "data1";
		p.method1();
		p.method2();
		p.method4(); // 예외 : child에서 오버라이딩된 메소드 사용 가능

		// Child 클래스의 멤버 사용 불가
		// p.field2="data2";
		// p.method3();

		// 클래스의 멤버 사용 가능하도록 하기 위해서는
		// 다시 Child 타입으로 강제 타입 변환

		Child c = (Child) p;
		c.field2 = "data2";
		c.method3();

		System.out.println(c.field1);
	}

}
