package ch03_operator.sec02;

import java.util.Scanner;

public class CompareOperator2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		String pass = "1234";
		String usePass;
		
		System.out.print("비밀번호입력 : ");
		usePass =sc.next();
		//문자열 비교는 == 사용하지않고 equals() 메소드 사용 
		
		if(pass.equals(usePass)) {
			System.out.println("PASS");
			System.out.println("Welocome");
		} else { 
			System.out.println("NO PASS");
		}
		
		System.out.print("안녕하세요");
		System.out.print("반갑습니다");
		// print(줄바꿈X) println(줄바꿈O)
		sc.close();
	}
		/*if문 
		1행인 경우 블록 {} 없어도 됨
		2행 이상인 경우 반드시 블록 {}으로 묶어야함*/
}
