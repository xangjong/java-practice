package ch07_Inheritance.sec04;

public class People {
	private String name;
	private String ssn;

	public People(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}

	@Override
	public String toString() {
		return "name : " + name + "\nssn : " + ssn;
	}

}
