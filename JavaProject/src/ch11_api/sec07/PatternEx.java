package ch11_api.sec07;

import java.util.regex.Pattern;

public class PatternEx {

	public static void main(String[] args) {
		// 정규식과 Pattern 클래스 예제

		String regExp = "(02|010)-\\d{3,4}-\\d{4}";
		String data = "010-123-4567";

		boolean result = Pattern.matches(regExp, data);
		if (result) {
			System.out.println("정규식과 일치합니다.");
		} else {
			System.out.println("정규식과 일치하지 않습니다.");
		}
		
		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		data = "angel@naver.co.kr";
		result = Pattern.matches(regExp, data);
		if (result) {
			System.out.println("정규식과 일치합니다.");
		} else {
			System.out.println("정규식과 일치하지 않습니다.");
		}
		
		System.out.println("홍길동이 \"안녕하세요 \"라고 말했습니다");
		
		
		
	}

}
