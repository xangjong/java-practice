package ch06_class.sec02;

import java.util.Scanner;

public class CircleMain {

	public static void main(String[] args) {
		// 매개변수 반환형이 있는 메서드 연습문제
		Scanner sc = new Scanner(System.in);
		Circle circle = new Circle();
		
		System.out.print("원의 반지름 입력 : ");
		//int radius = sc.nextInt(); 
		//setRadius.nextInt(radius);	
		circle.setRadius(sc.nextInt());

		System.out.println();
		System.out.println("원의 넓이는 " + circle.getArea() + " 입니다.");

		sc.close();
	}

}
