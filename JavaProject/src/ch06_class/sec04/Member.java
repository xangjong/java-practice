package ch06_class.sec04;

public class Member {
	private String id;
	private	String name;
	private int age;
	private String num;
	private String address;
	

	public Member(String id, String name, int age, String num, String address) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.num = num;
		this.address = address;
		
	}


	public void showMember() { 
		System.out.println("ID : " + id);
		System.out.println("성명 : " +name);
		System.out.println("나이 : " + age);
		System.out.println("전화번호 입력 : " + num);
		System.out.println("주소 입력 : " + address);
	}
}
