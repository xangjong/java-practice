package ch06_class.sec04;

public class BookMain {

	public static void main(String[] args) {
		/*
		 	매개변수가 있는 생성자 호출
		객체 생성 시 반드시 매개변수의 개수, 순서, 데이터 타입에
		맞춰서 값을 전달해야 함
		*/
		Book book = new Book("자바", "홍길동", 20000);
		Book book2 = new Book();
		Book book3 = new Book("자바스크립트", "이몽룡",40000);
		
		book.showBook();
		book2.showBook();
		book3.showBook();
	}

}
