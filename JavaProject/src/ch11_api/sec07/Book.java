package ch11_api.sec07;

public class Book {
	String bookNo;
	String bookName;
	String bookAuthor;
	int bookPrice;

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

	public int getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}

	public Book(String bookNo, String bookName, String bookAuthor, int bookPrice) {
		super();
		this.bookNo = bookNo;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookPrice = bookPrice;
	}

	@Override
	public String toString() {
		// 한꺼번에 문자열을 저장해서 전달하기 위해 StringBuilder 클래스 사용
		StringBuilder builder = new StringBuilder();
		builder.append(bookNo);
		builder.append("\t");
		builder.append(bookName);
		builder.append("\t");
		builder.append(bookAuthor);
		builder.append("\t");
		builder.append(bookPrice);
		return builder.toString();
	}

}
