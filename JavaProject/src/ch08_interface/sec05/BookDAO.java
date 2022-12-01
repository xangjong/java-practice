package ch08_interface.sec05;

import java.util.ArrayList;

public class BookDAO implements IBookDAO {

	@Override
	public void insertBook(BookDTO dto) {
		System.out.println("도서 등록 성공");
		System.out.println("도서번호 : " + dto.getBookNo());
		System.out.println("책이름 : " + dto.getBookName());
		System.out.println("저자 : " + dto.getBookAuthor());
		System.out.println("출판사 : " + dto.getBookMaker());
		System.out.println("발행일 : " + dto.getBookDate());
		System.out.println("가격 : " + dto.getBookprice());

	}

	@Override
	public void deleteBook(String bookNo) {
		System.out.println(bookNo + " 삭제 성공");

	}

	@Override
	public ArrayList<BookDTO> getAllBook() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateBook(BookDTO dto) {
		// TODO Auto-generated method stub

	}

}