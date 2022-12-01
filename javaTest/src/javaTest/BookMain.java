package javaTest;

public class BookMain {

	public static void main(String[] args) {
		
		System.out.println("도서번호\t    도서명\t 저자\t 가격\t발행연도\t 출판사");
		System.out.println("--------------------------------------------------------");
		
		Book bk = new Book("B001", "자바 프로그래밍", "홍길동", 25000, "2022", "멀티출판사");
		System.out.println(bk);
		Book bk2 = new Book("B002", "자바스크립트", "이몽룡", 30000, "2020", "서울출판사");
		System.out.println(bk2);
		Book bk3 = new Book("B003", "HTML/CSS", "성춘향", 18000, "2021", "강남출판사");
		System.out.println(bk3);
		
		System.out.println();
		
		System.out.println("잡지번호\t 잡지명\t 발행인\t 가격\t발행연도\t 출판사\t  발행월");		
		System.out.println("--------------------------------------------------------");
		Magazine mg = new Magazine("M001", "자바 월드", "홍길동", 25000, "2021", "멀티출판사", 5);
		System.out.println(mg);
		Magazine mg1 = new Magazine("M002", "웹 월드", "이몽룡", 30000, "2020", "서울출판사", 7);
		System.out.println(mg1);
		Magazine mg2 = new Magazine("M003", "게임 월드", "성춘향", 18000, "2022", "강남출판사", 9);
		System.out.println(mg2);
	}

}
