package ch05_reference_type.sec01;

public class StringCompare {

	public static void main(String[] args) {
		// 문자열 비교
		String str1 = "홍길동";
		String str2 = "홍길동";
		// str1과 str2는 동일한 String 객체 참조

		// 같은 객체를 참조하는 비교할 때 : == 사용
		if (str1 == str2) {
			System.out.println("str1과 str2는 참조가 같음");
		} else {
			System.out.println("str1과 str2는 참조가 다름");
		}

		System.out.println("-------");

		if (str1.equals(str2)) {
			System.out.println("str1과 str2는 문자열 같음");

		} else {
			System.out.println("str1과 str2는 문자열 다름");
		}

	}

}
