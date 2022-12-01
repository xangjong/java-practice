package ch02_variable.sec04;

import java.util.Scanner;

public class NextLine {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//nextLine(): '\'까지 포함한 라인 전체를 문자열 반환
		String address;
		
		System.out.println("주소 입력 :");
		address = sc.nextLine();
		System.out.println("주소 :" + address);
		sc.close();
				
	}

}
