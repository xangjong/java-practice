package ch11_api.sec01;

import java.util.Objects;

class Student {
	int sno;
	String name;

	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}

	@Override
	public int hashCode() {
		// sno의 name 같으면 동일 객체로 간주하도록
		// Objects.hash(sno, name) 메소드
		// 매개값으로 전달된 값을 이용해서 해시 코드 생성
		return Objects.hash(sno, name);
	}
}

public class HashCodeEx {
	public static void main(String[] args) {
		Student s1 = new Student(1, "홍길동");
		Student s2 = new Student(3, "홍길동");

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());

		// Objects.hashcode(객체) : 객체의 해시코드 리턴
		System.out.println(Objects.hashCode(s1));
		System.out.println(Objects.hashCode(s2));

	}
}
