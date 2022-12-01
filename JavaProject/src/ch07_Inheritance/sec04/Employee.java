package ch07_Inheritance.sec04;

public class Employee {
	private String empNo;
	private String name;
	private String part;

	public Employee(String empNo, String name, String part) {
		this.empNo = empNo;
		this.name = name;
		this.part = part;
	}

	@Override
	public String toString() {
		return "사번 : " + empNo + "\n성명 : " + name + "\n부서 : " + part;
	}

}
