package javaTest;

public class Book {

	private String bookNo;
	private String bookTitle;
	private String bookAuthor;
	private int bookPrice;
	private String bookYear;
	private String bookPublisher;

	@Override
	public String toString() {
		return bookNo + "\t" + bookTitle + "\t" + bookAuthor + "\t" + bookPrice + "\t" + bookYear + "\t"
				+ bookPublisher;
	}

	public Book(String bookNo, String bookTitle, String bookAuthor, int bookPrice, String bookYear,
			String bookPublisher) {
		super();
		this.bookNo = bookNo;
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.bookPrice = bookPrice;
		this.bookYear = bookYear;
		this.bookPublisher = bookPublisher;
	}

}
