package ch06_class.sec04;

public class Book {
	private String title;
	private String author;
	private int price;
	//매개변수가 없는 생성자 
	public Book() { 
		this("도서명 없음", "저자 없음", 0);
	}
	
	// 매개변수가 있는 생성자 
	// 값 전달 받아서 멤버필드 초기화 
	public Book(String title, String author, int price ) { 
		this.title=title;
		this.author=author;
		this.price=price;
	}
	public void showBook() { 
		System.out.println("도서명 : " + title );
		System.out.println("저자 : " + author );
		System.out.println("가격 : " + price );
	}
}
