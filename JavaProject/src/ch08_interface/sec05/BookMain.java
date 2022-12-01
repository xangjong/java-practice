package ch08_interface.sec05;

public class BookMain {

	public static void main(String[] args) {
		
		BookDTO dto = new BookDTO("1001", "자바", "홍길동", "멀티", "2022-04-20", 28000);
		
		BookController ctrl = new BookController();
		ctrl.insertBook(dto);
		
		ctrl.deleteBook("1001");
	}

}