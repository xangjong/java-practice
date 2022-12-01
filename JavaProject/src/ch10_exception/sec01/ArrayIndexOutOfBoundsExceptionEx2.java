package ch10_exception.sec01;

public class ArrayIndexOutOfBoundsExceptionEx2 {

	public static void main(String[] args) {
		String data1= args[0];
		String data2 = args[1];
		
		
		System.out.println("args[0] : " + data1);
		System.out.println("args[1] : " + data2);
		// main() args에 값이 설정되어 있지 않으면 ArrayIndexOutOfBoundsException 예외 발생
		// args 값 설정 : Run -> Run-Configuration에서 매개값 설정 
		
		
	}

}
