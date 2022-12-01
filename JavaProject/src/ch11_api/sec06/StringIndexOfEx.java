package ch11_api.sec06;

public class StringIndexOfEx {

	public static void main(String[] args) {
//		indexOf()예제
		String subject ="자바 프로그래밍";
		
		int location = subject.indexOf("프로그래밍");
		System.out.println(location);
		
		if(subject.indexOf("자바") == -1) { 
			System.out.println("자바와 관련이 없는 책이군요.");
		} else { 
			System.out.println("자바와 관련 책이군요");
		}
		
		String email = "abc@naver.com";
		
		int location2 = email.indexOf("naver.com");
		
		if(email.indexOf("abc") == -1) { 
			System.out.println("abc 관련이 없는 책이군요.");
		} else { 
			System.out.println("abc 관련 책이군요");
		}
		
	}

}
