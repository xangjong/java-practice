package ch11_api.sec08;

import java.text.MessageFormat;

public class MessageFormatEx {

	public static void main(String[] args) {
//		MessageFormat 클래스 예제

		String id = "abcd";
		String name = "홍길동";
		String tel = "010-1234-5678";

		String text = "회원 ID : {0}, 회원 이름 : {1}, 회원 전화 {2}";
		String result = MessageFormat.format(text, id, name, tel);
		System.out.println(result);

		System.out.println();
		String sql = "insert into member values({0},{1}, {2})";
		Object[] arguments = {"'abcd'", "'이몽룡'", "'010-1111-1111'"};
		String result2 = MessageFormat.format(sql, arguments);
		System.out.println(result2);
		
		
	}

}
