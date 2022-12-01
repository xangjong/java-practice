package ch03_ex;

import java.util.Scanner;

public class WhileEx3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int balance = 0, withdraw = 0;
		
		while (num != 4) {
			System.out.println("----------------");
			System.out.println("1.예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("----------------");
			System.out.print("선택 > ");
			num = sc.nextInt();

			switch (num) {
			case 1:
				System.out.print("예금액 > ");
				balance += sc.nextInt();
				break;
			case 2:
				System.out.print("출금액 > ");
				balance -= sc.nextInt();
				if (balance-withdraw<0) System.out.println("잔액부족");
				break;
			case 3 :
				System.out.println("잔고 > " + balance);
				break;
			case 4:
				break;
			default:
				System.out.println("값을 잘못 입력하였습니다.");
			}
		}
		System.out.println("프로그램 종료");

		sc.close();

	}

}
