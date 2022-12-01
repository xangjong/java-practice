package ch07_Inheritance.sec01;

import java.util.Scanner;

public class Employee {
	int num; 
	String name;
	String part;
	public void setEmployee() { 
		Scanner sc = new Scanner(System.in);
		System.out.print("사번 입력 : ");
		num=sc.nextInt();
		System.out.print("성명 입력 : ");
		name=sc.next();
		System.out.print("부서 입력 : ");
		part=sc.next();
		
	
	}
	public void showEmpInfo() { 
		System.out.println("사번 : " + num );
		System.out.println("성명 : " + name );
		System.out.println("부서 : " + part );
	}
}
