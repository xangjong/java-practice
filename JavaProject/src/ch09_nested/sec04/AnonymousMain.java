package ch09_nested.sec04;

public class AnonymousMain {

	public static void main(String[] args) {
		// 익명 자식 객체 예제

		Annonymous annoy = new Annonymous();

		// 부모 탕비의 재정된 메소드 wake() 호출
		// 익명 객체 필드 사용

		annoy.field.wake();

		annoy.method1();

		annoy.method2(new Person() {
			void study() {
				System.out.println("공부합니다.");
			}

			@Override
			void wake() {
				System.out.println("8시에 일어납니다.");
				study();
			}

		}

		);

	}

}
