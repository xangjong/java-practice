package ch06_class.sec03;

import java.util.Scanner;

public class SavingsMain2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Savings2 s1 = new Savings2();

		s1.setName("홍길동");
		s1.setBalance(10000);

		System.out.println("예금주 : " + s1.getName());
		System.out.println("입금전 잔액 : " + s1.getBalance());
		System.out.print("예금액 입력 : ");
		s1.inputDeposit(sc.nextInt());
		System.out.println("이자 : " + s1.getInterest());
		System.out.println("최종 잔액 : " + s1.getBalance());

		sc.close();

	}

}