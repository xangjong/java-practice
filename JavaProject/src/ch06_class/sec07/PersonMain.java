package ch06_class.sec07;

public class PersonMain {

	public static void main(String[] args) {
		// 
		Person p1 = new Person("123456-1234567", "홍길동");
		Person p2 = new Person("543216-1234567", "이몽룡");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		System.out.println(p2.nation);
		System.out.println(p2.ssn);
		System.out.println(p2.name);
		
		// fianl 필드 수정 불가 
	}

}
