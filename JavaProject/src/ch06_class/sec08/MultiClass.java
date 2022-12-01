package ch06_class.sec08;

import java.util.Scanner;

class Add {
	private int a, b;

	public Add(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public void caculate() {
		System.out.println("더하기 : " + (a + b));
	}
}

class Substract {
	private int a, b;

	public Substract(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public void caculate() {
		System.out.println("빼기 : " + (a - b));

	}
}

class Multiply {
	private int a, b;

	public Multiply(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public void caculate() {
		System.out.println("곱하기 : " + (a * b));
	}
}

class Divide {
	private int a, b;

	public Divide(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public void caculate() {
		System.out.println("나누기 : " + (a / b));
	}
}

public class MultiClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		char operator;
		System.out.print("정수 1 입력 : ");
		a = sc.nextInt();
		System.out.print("정수 2 입력 : ");
		b = sc.nextInt();

		System.out.print("연산자 입력 (+,-*,/) : ");
		operator = sc.next().charAt(0); // 첫 번째 문자만 추출

		switch (operator) {
		case '+':
			Add add = new Add(a,b);
			add.caculate(); break;
		case '-':
			Substract substract = new Substract(a,b);
			substract.caculate(); break;
		case '*':
			Multiply multiply = new Multiply(a,b);
			multiply.caculate(); break;
		case '/':
			Divide divide = new Divide(a,b);
			divide.caculate(); break;
		default : System.out.println("잘못된 연산자");
		}
		/*
		 * switch 문 사용해서 각 연산자 별로 해당되는 객체 생성해서 연산 수행
		정수 1 입력 : 7 
		정수 2 입력 : 5
		연산자 입력 (+,-*,/) :
		잘못된 연산자
		*/

		sc.close();
	}
}
