package ch07_Inheritance.sec04;

public class Manager extends Employee {
	private String position;
	
	// 매개변수가 4개 있는 생성자
	// 3개는 부모 클래스의 생성자에게 전달하고 1개는 자신 사용
	public Manager(String empNo, String name, String part, String position) {
		// 부모 클래스의 생성자 호출하면서 필요한 개수만큼 전달 
		super(empNo, name, part);
		this.position = position;

	}

	@Override
	public String toString() {
		return super.toString() + "\n직위 : " + position;
	}

}
