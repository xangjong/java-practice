package ch06_class.sec01;

import java.util.Scanner;

public class Rectangle {
	private int width;
	private int height;
	
	//입력 받아서 멤버 필드에 값 저장하는 일을 하는 메소드 
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("가로 길이 : ");
		width=sc.nextInt();
		
		System.out.print("세로 길이 : ");
		height=sc.nextInt();
		
		sc.close();
	}
	
	//사각형의 넓이를 구해서 출력하는 메소드 
	public void getArea(){ 
		System.out.println("사각형의 넓이 : " + (width*height));
	}
}
