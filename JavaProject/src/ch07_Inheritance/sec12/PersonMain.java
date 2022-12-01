package ch07_Inheritance.sec12;

public class PersonMain {
	public static void main(String[] args) {
		// 객체 배열 예제

		Person[] p = new Person[3]; // 레퍼런스 배열 생성

		System.out.println("개인 정보 입력 ");
		for (int i = 0; i < p.length; i++) {
			p[i] = new Person(); // 객체 생성
			p[i].input();
		}
		System.out.println("개인 정보 출력 ");
		for (int i = 0; i < p.length; i++) {
			p[i].output();
		}
		Person.sc.close();
	}
}
