package ch06_class.sec10;

public class Student {
	
	private String num;
	private String name;
	private int grade;
	private int score;
	
	public String getNum() {
		return num;
	}
	
	public Student(String num, String name, int grade, int score) {
		super();
		this.num = num;
		this.name = name;
		this.grade = grade;
		this.score = score;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	@Override
	public String toString() {
		return "Student " + num + "," + name + ","+ grade + "," + score;
	}
	
}