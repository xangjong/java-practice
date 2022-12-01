package ch05_reference_type.sec01;

public class NullPointerException {

	public static void main(String[] args) {
		// null 값을 가지고 있는 객체 사용시 NullPointerException발생
		// String name =null;
		String name=null;
		if(name.equals("홍길동")) {
			System.out.println(name + "직원입니다.");
		}
	}

}
