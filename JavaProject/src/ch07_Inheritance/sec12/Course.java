package ch07_Inheritance.sec12;

import java.util.Scanner;

public class Course {
	static Scanner sc = new Scanner(System.in);
	String subject; 
	String professor;
	int year;
	double grade;
	
	
	public void input() {
		System.out.print("과목 명 : ");
		subject=sc.next();
		System.out.print("교수 : ");
		professor=sc.next();
		System.out.print("학년 : ");
		year=sc.nextInt();
		System.out.print("이수 학점 : ");
		grade=sc.nextDouble();
		
	} 
	
	public void output() { 
		System.out.println("과목 명 : " + subject);
		System.out.println("교수 : " + professor);
		System.out.println("학년 : " + year);
		System.out.println("이수 학점 : " + grade);
	} 
}
