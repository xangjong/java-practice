package ch06_class.sec10;

public class MemberMain {

	public static void main(String[] args) {
		// Getters & Setters
		Member mem = new Member("abcd", "1234", "홍길동", 20);
		Member mem2 = new Member("sky", "5678", "이몽룡", 30);

		System.out.println(mem.getName());

		mem.setName("이몽룡");
		System.out.println(mem.getName());
		System.out.println("--------------");
		
		System.out.println(mem);
		System.out.println(mem2);
	}

}
