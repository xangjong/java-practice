package ch08_interface.sec05;

public class BookController {
	BookDAO dao = new BookDAO();
	
	public void insertBook(BookDTO dto) {
		dao.insertBook(dto);
	}
	
	public void deleteBook(String bookNo) {
		dao.deleteBook(bookNo);
	}
}