package ch06_ex;

import java.util.Scanner;

public class AppStart {
	public static void main(String[] args) { 
		int MenuNum=0; 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("****************************************");
		System.out.println("★★게임에 오신 것을 환영합니다^^\n"
				+ "");
		System.out.println("***************************************");
		
	while(MenuNum!=4) {
		System.out.println("메뉴");
		System.out.println("------------------");
		System.out.print("1. 애플리케이션 정보");
		System.out.println("2. 가위바위보 게임");
		System.out.println("3. 숫자 알아맞히기 게임");
		System.out.println("4. 종료");
		
		switch(MenuNum) {
		
		case 1 : break;
		case 2 : break;
		case 3 : break;
		case 4 : System.out.println("종료합니다.");break;
		
		default : System.out.println("잘못 입력하였습니다.");
		}
		
		
	} System.out.println("종료합니다!");
		
		sc.close();
	}
}
