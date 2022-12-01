package ch11_api.sec07;

import java.util.StringTokenizer;

public class StringTokenizerEx {

	public static void main(String[] args) {
//		StringTokenizer 클래스 예제 

		String text = "홍길동/이몽룡/성춘향";

//		토큰 추출 방법 1 : 전체 토큰 수를 알아내서 for문으로 반복 처리
		StringTokenizer st = new StringTokenizer(text, "/"); // 구분자: /
		int countTokens = st.countTokens();
		System.out.println(countTokens);

		for (int i = 0; i < countTokens; i++) {
			String token = st.nextToken();
			System.out.println(token);
		}
		System.out.println();

//		토큰 추출 방법 2 : 메소드를 사용해서 남아 있는 토큰을 확인하고 while문으로 반복 처리
		st = new StringTokenizer(text, "/");
		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}

	}

}
