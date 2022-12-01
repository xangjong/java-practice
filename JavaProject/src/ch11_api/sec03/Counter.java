package ch11_api.sec03;

public class Counter {
	private int no;

	public Counter(int no) {
		this.no = no;
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println(no + "번 객체의 finalize()가 실행됨");
	}
	
	// Throwable 클래스 : Java 언어의 모든 에러와 예외의 슈퍼 클래스
	// Throwable (상위 클래스) 
	// Exception, Error (하위 클래스)
	
}
