package javaTest;

public class Magazine extends Book {
	private int mzMouth;

	
	@Override
	public String toString() {
		return super.toString() + "\t    " + mzMouth;
	}

	public Magazine(String bookNo, String bookTitle, String bookAuthor, int bookPrice, String bookYear,
			String bookPublisher, int mzMouth) {
		super(bookNo, bookTitle, bookAuthor, bookPrice, bookYear, bookPublisher);
		this.mzMouth = mzMouth;
	}



	
}
