package ch10_exception.sec03;

public class AccountMain {
	public static void main(String[] args) {
	//	사용자 정의 예외와 예외 발생 예제 	
		Account account = new Account();
		
	//	예금하기
		account.deposit(20000);
		System.out.println("예금액 : " + account.getBalance());
		
	//	출금하기
		
		try {
			account.withdraw(30000); //	throws 있는 메소드 : 반드시 try문에서 호출 
		} catch (BalanceInsufficientException e) {
			// 예외 발생시킬 때 생성자에게 전달한 메세지 반환(예외 객체 내부에 저장됨)
			String message = e.getMessage();
			System.out.println(message);
			System.out.println();
			System.out.println("예외 추적 내용 출력");
			e.printStackTrace(); // 오류 내용
		}
		
	}
}
