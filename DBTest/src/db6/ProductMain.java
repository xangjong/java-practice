package db6;

public class ProductMain {

	public static void main(String[] args) {
		// DTO / DAO 사용

		// DAO 객체 생성하면서 DB 연결
		// selectStudent() 메서드 호출
		ProductDAO stdDAO = new ProductDAO();

		// 데이터 저장 : StudentDTO 객체 생성 / 데이터 저장
		ProductDTO stdDTO = new ProductDTO("21", "갤럭시 s1011", 1250000, "삼성", "흰색", "1");

		// insertStudent(stdDTO) 호출하면서 stdDTO 전달
		stdDAO.insertStudent(stdDTO);

		stdDAO.selectStudent();

		stdDAO.close();
	}

}
