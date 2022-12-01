package ch03_operator.sec02;

public class LogicalOperator {

	public static void main(String[] args) {
		// 논리 연산자
		
		int charCode ='A'; //65
		
		if((charCode>=65) & (charCode<=90)) {
			System.out.println("대문자");
		}
		if((charCode>=97) & (charCode<=122)) {
			System.out.println("소문자");
		}
		if(!(charCode<48) && !(charCode>57)) {
			System.out.println("0~9 숫자");
		}
		//value가 2 또는 3의 배수이면 "2또는 3의 배수이군요" 출력
		
		int value = 6;
		if ((value % 2 == 0) || (value % 3 == 0)) {
			System.out.println("2 또는 3의 배수이군요.");
		}
		String id = "abcd";
		//아이디 6~10자
		// 6~10가 아닌 경우 ID는 6~10자로 입력하세요" 출력 
		if((id.length() <6) || (id.length()>10)) {
			System.out.println("ID는 6~10자로 입력하세요.");
		}
		
	}	

}
