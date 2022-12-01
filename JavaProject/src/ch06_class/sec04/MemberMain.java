package ch06_class.sec04;

import java.util.Scanner;

public class MemberMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String id;
		String name;
		int age;
		String num;
		String address;
		
		
		Member m = new Member("hkd", "홍길동", 30
				,"010-1234-5678", "서울시 강남구 대치동");

		m.showMember();
		System.out.println("------------------");
		
		System.out.print("아이디 입력 : ");
		id=sc.nextLine();
		System.out.print("성명 입력 : ");
		name=sc.nextLine();
		System.out.print("나이 입력 : ");
		age=sc.nextInt();
		sc.nextLine();
		System.out.print("전화번호 입력 : ");
		num=sc.nextLine();
		System.out.print("주소 입력 : ");
		address=sc.nextLine();
		
		Member m2 = new Member(id, name, age, num, address);
		m2.showMember();
		
		sc.close();
	}

}
