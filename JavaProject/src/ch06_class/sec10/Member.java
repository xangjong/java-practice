package ch06_class.sec10;

public class Member {
	private String id;
	private String pass;
	private String name;
	private int age;
	
	// 매개변수가 있는  
	public Member(String id, String pass, String name, int age) {
		super();
		this.id = id;
		this.pass = pass;
		this.name = name;
		this.age = age;
	}
	// Getters & Setters 
	// 필드 값 설정 & 필드 값 반환 
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	// showMemInfo(){ ... }
	// toString() 메소드 : 객체 출력 시 자동 호출 
	// @Override :이미 만들어 있는 toString() 재정의해서 사용
	
	@Override
	public String toString() {
		return "\n id : " +id + "\n pass : "  + pass + "\n name : " + name 
				+"\n age : " + age;
	}
	
}
