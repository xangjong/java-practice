package ch07_Inheritance.sec04;

public class EmpManagerMain {

	public static void main(String[] args) {
		// 부모 클래스의 매개변수가 있는 생성자 호출하면서 값 전달하는 예제
		
		/*
		 * 자식 클래스의 인스턴스(객체) 생성할 때 
		자식 클래스의 생성자 호출 : 매개변수 전달 
		이때 부모 클래스의 생성자도 자동 호출되므로 
		부모 클래스의 생성자에서 필요한 매개변수도 같이 전달
		*/ 
		Manager mg = new Manager("1234", "홍길동", "마케팅", "대리");
		System.out.println(mg);
	}

}
