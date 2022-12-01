package ch11_api.sec07;

public class BookMain {

	public static void main(String[] args) {
		
		Book book = new Book("1001", "자바 프로그래밍", "홍길동", 20000 );
		System.out.println(book);
		
		Book book2 = new Book("1002", "데이터베이스", "이몽룡", 23000 );
		System.out.println(book2);
	}

}
