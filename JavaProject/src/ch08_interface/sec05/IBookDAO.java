package ch08_interface.sec05;

import java.util.ArrayList;

public interface IBookDAO {
	public void insertBook(BookDTO dto); 
	public void deleteBook(String bookName); 
	public ArrayList<BookDTO> getAllBook();
	public void updateBook(BookDTO dto);
}