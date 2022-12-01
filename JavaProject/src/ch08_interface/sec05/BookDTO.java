package ch08_interface.sec05;

public class BookDTO {
	private String bookNo;
	private String bookName;
	private String bookAuthor;
	private String bookMaker;
	private String bookDate;
	private int bookprice;
	
	public BookDTO(String bookNo, String bookName, String bookAuthor, String bookMaker, String bookDate, int bookprice) {
		super();
		this.bookNo = bookNo;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookMaker = bookMaker;
		this.bookDate = bookDate;
		this.bookprice = bookprice;
	}

	public String getBookNo() {
		return bookNo;
	}

	public void setBookNo(String bookNo) {
		this.bookNo = bookNo;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public String getBookMaker() {
		return bookMaker;
	}

	public void setBookMaker(String bookMaker) {
		this.bookMaker = bookMaker;
	}

	public String getBookDate() {
		return bookDate;
	}

	public void setBookDate(String bookDate) {
		this.bookDate = bookDate;
	}

	public int getBookprice() {
		return bookprice;
	}

	public void setBookprice(int bookprice) {
		this.bookprice = bookprice;
	}

	
	
	
}