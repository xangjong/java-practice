package ch11_api.sec06;

public class StringCharAtEx {

	public static void main(String[] args) {
		// charAt 메소드 예제 
		String ssn = "010203-1134123";
		
		char gender = ssn.charAt(7);
		
		switch (gender) { // switch (ssn.charAt(7))  
		case '1' : 
		case '3' : System.out.println("남자입니다.");
			break;
		case '2' : 
		case '4' : 
			System.out.println("여자입니다.");
			break;
		
		default : System.out.println("확인할 수 없습니다.");
		}
	}

}
