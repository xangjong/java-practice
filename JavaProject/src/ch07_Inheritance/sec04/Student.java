package ch07_Inheritance.sec04;

public class Student extends People {
	private String stdNo;

	public Student(String name, String ssn, String stdNo) {
		super(name, ssn);
		this.stdNo = stdNo;
	}

	@Override
	public String toString() {
		return super.toString() + "\nstdNo : " + stdNo;
	}
	
	
}
