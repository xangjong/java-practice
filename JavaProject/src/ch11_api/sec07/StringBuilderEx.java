package ch11_api.sec07;

public class StringBuilderEx {

	public static void main(String[] args) {
//		StringBuild 예제
		StringBuilder sb = new StringBuilder();

		sb.append("Java ");
		sb.append("Program Study");
		System.out.println(sb.toString());

		sb.insert(4, "2"); // 인덱스 4의 위치에 2 추가 : 큰 따옴표, 작은 따옴표 둘다 사용 가능
		System.out.println(sb.toString());

		sb.setCharAt(4, '6'); // ' ' 작은 따옴표만 사용 가능
		System.out.println(sb.toString());

		// start에서 end -1 까지
		sb.replace(6, 13, "Book"); // 6에서 시작해서 13 -1까지 문자열을 Book으로 대치
		System.out.println(sb.toString());

		sb.delete(4, 5); // 4에서 5-1 까지 (4~4:4) 1문자 삭제
		System.out.println(sb.toString());

		int length = sb.length();
		System.out.println("총 문자수 : " + length);

		String result = sb.toString();
		System.out.println(result);
	}

}
