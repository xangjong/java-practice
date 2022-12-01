package ch06_class.sec03;

public class Savings2 {
	private String name;
	private int interest, balance;
	
	// 매개변수로 전달된 값 받아서 멤버 필드 값 설정
	public void setName(String name) {
		this.name = name;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void inputDeposit(int deposit) {
		balance += deposit;
		interest = (int) (balance * 0.1);
	}

	public int getInterest() {
		return interest;
	}

	public int getBalance() {
		return balance + interest;
	}
}