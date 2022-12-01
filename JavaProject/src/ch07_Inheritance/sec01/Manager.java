package ch07_Inheritance.sec01;

import java.util.Scanner;

public class Manager extends Employee {
	String position;
	
	public void setManager() { 
		setEmployee();
		Scanner sc = new Scanner(System.in);
		System.out.print("직위 입력 : ");
		position=sc.next();
		sc.close();
	}
	public void showManagerInfo() { 
		showEmpInfo();
		System.out.println("직위 : " + position);
	} 
}
