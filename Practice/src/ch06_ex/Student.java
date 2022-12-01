package ch06_ex;

import java.util.Scanner;

public class Student {
	String stdNo, stdName; 
	int stdYear, stdScore;
	
	public void inputStdInfo() { 
		Scanner sc = new Scanner(System.in);
		System.out.println("******학생 정보 입력 **********");
		System.out.print("학번 : ");
		stdNo=sc.next();
		System.out.print("성명 : ");
		stdName=sc.next();
		System.out.print("학년 : ");
		stdYear = sc.nextInt();
		System.out.print("점수 : ");
		stdScore=sc.nextInt();
		
		sc.close();
	}
	
	public void showStdInfo() { 
		System.out.println("******학생 정보 출력 **********");
		System.out.println("학번 : " + stdNo);
		System.out.println("성명 : " + stdName);
		System.out.println("학년 : "+ stdYear);
		System.out.println("점수 : "+ stdScore);
		
	}
	
}
