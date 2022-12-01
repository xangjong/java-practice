package ch07_Inheritance.sec12;

import java.util.Scanner;

public class Person {
	static Scanner sc = new Scanner(System.in);
	String name;
	int age, height, weight; 
	
	public void input() { 
		System.out.print("성명 입력 : ");
		name=sc.next();
		
		System.out.print("나이 입력 : ");
		age=sc.nextInt();
		
		System.out.print("키 입력(cm) : ");
		height=sc.nextInt();
		
		System.out.print("몸무게 입력(kg) : ");
		weight=sc.nextInt();
	}
	
	public void output() {
		System.out.println(name + " ");
		System.out.println(age + " ");
		System.out.println(height + "cm");
		System.out.println(weight + "kg");

		
	}
}
