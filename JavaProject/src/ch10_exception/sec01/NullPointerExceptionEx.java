package ch10_exception.sec01;

public class NullPointerExceptionEx {

	public static void main(String[] args) {
		// String data = null; null로 초기화하고 값을 저장하지 않으 상태에서 멤버 접근해서 사용시 예외 발생
		String data = ""; // 공백 문자열로 초기화할 경우 예외 발생하지 않음
		System.out.println(data.equals("자바"));
	}

}
