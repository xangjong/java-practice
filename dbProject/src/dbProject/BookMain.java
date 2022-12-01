package dbProject;

public class BookMain {

	public static void main(String[] args) {

		BookDAO bookDAO = new BookDAO();

		BookDTO bookDTO = new BookDTO("B006", "자바스크립트", "강길동", 2022, 28000, "멀티출판사");

		bookDAO.insertBook(bookDTO);

		bookDAO.selectBook();

	}

}
