package ch10_exception.sec02;

public class CatchOrder {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3 };

		try {
			System.out.println(arr[5]);
		} catch (ArrayIndexOutOfBoundsException e) { // 하위 클래스의 catch 블록 위에  
			System.out.println("배열의 인덱스를 벗어났습니다.");
		} catch (Exception e ) {					
			System.out.println("숫자로 변환할 수 없습니다.");
		} finally { 										
			System.out.println("다시 실행하세요.");
		}
	}
}
