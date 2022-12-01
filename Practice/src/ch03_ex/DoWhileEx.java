package ch03_ex;

import java.util.Scanner;

public class DoWhileEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		int sum=0;
		
		do {
			System.out.print("숫자 입력 : ");
			num=sc.nextInt();
			sum+=num;
		} while(num!=0);
			System.out.println( num + "입력. 반복문 종료");
			System.out.println("입력한 숫자 총합 : " + sum);
			
	}

}
