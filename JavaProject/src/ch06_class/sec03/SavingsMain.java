package ch06_class.sec03;

public class SavingsMain {

	public static void main(String[] args) {
		Savings savings = new Savings();
		
		//멤버 필드 값 설정
		savings.setName();
		savings.setBalance();
		
		// 멤버 필드 호출해서 작업 후 출력
		System.out.println("예금주 : " + savings.getName());
		System.out.println("입금전 잔액 : " + savings.getBalance());		
		savings.inputDeposit();	
		System.out.println("이자 : " +  savings.getInterest());
		System.out.println("최종 잔액 : " + savings.getBalance());
	}

}