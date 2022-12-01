package ch10_exception.sec02;

public class TryCatchEx {

	public static void main(String[] args) {
		// try ~ catch 예제

		
		try {
			Class clazz = Class.forName("Java.lang.String"); 
			System.out.println();
		} catch (Exception e) {
			System.out.println("클래스가 존재하지 않습니다.");
			// e.printStackTrace();
		}
		
		/*	
		 try {
				Class clazz = Class.forName("Java.lang.String"); // ClassNotFoundException 발생
			} catch (ClassNotFoundException e) {
				// 예외 처리 구분
				System.out.println("클래스가 존재하지 않습니다.");
			}	
		*/
		System.out.println("종료");

	}

}
