package ch07_Inheritance.sec01;

public class ParentChildMain {

	public static void main(String[] args) {
		// 클래스 상속
		Child ob = new Child();

		// Child 클래스 객체가 자신의 멤버 사용
		ob.setChild();
		ob.showChild();

		// 자식 클래스는 부모 클래스 멤버 사용 가능
		ob.setParent(); // 부모 클래스의 메소드 사용
		ob.showParent(); // 부모 클래스의 메소드 사용

	}

}
