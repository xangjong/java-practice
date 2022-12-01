package ch10_exception.sec03;

public class Account {
	private long balance;

	public Account() {
	}

	public long getBalance() {
		return balance;
	}

	public void deposit(int money) {
		balance += money;
	}

	// 출금 메소드 : 예외 발생
	// 자신을 호출한 곳에서 예외를 처리하도록 throws 키워드로 예외를 떠넘김
	public void withdraw(int money) throws BalanceInsufficientException {
		// 잔고가 부족하면 예외를 발생시키면서 예외 메세지 전달 (예외 메세지는 예외 객체 내부에 저장)
		if (balance < money) {
			throw new BalanceInsufficientException("잔고 부족 : " + (money - balance) + " 모자람");
		}
		balance -= money;
	}
}
