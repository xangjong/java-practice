package ch07_Inheritance.sec13;

public class InstanceofMain {

	public static void method1(Parent parent) {
		// 강제 타입 변환하기 전에 instanceof 연산자로 먼저 확인
		if (parent instanceof Child) {
			Child c = (Child) parent; // 강제 타입 변환
			System.out.println("method1 - Child로 변환 성공");
		} else {
			System.out.println("method1 - Child로 변환되지 않음");
		}
	}

	public static void method2(Parent parent) {
		// 강제 타입 변환하기 전에 instanceof 연산자로 먼저 확인하지 않고 바로 강제 타입 변환 수행
		Child c = (Child) parent; // 강제 타입 변환
		System.out.println("method2 - Child로 변환 성공");
	}

	public static void main(String[] args) {
		// instanceof 연산자 예제 : 강제 타입 변환하기 전에 먼저 타입 확인
		Parent pA = new Child(); // 자동 타입 변환
		method1(pA);

		Parent pB = new Parent();
		method1(pB);
		
		// instanceof 연산자로 먼저 확인하지 않고 바로 강제 타입 변환 수행
		method2(pA);  // 변환 가능
		method2(pB);  // 변환 불가 : 예외 발생
		// 결론 : 강제 타입 변환하기 전에 instanceof 연산자로 먼저 확인하고 변환 수행
		
	}

}






