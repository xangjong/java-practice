package ch10_exception.sec02;

public class MultiCatch {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3 };

		try {
			System.out.println(arr[5]); // 첫 번째 예외 발생
			// 즉시 실행을 멈추고 해당 catch 블록으로 이동
			System.out.println(Integer.parseInt("a100")); 	// 실행되지 않음
		} catch (ArrayIndexOutOfBoundsException e) { // 이동해서 예외 처리
			System.out.println("배열의 인덱스를 벗어났습니다.");
		} catch (NullPointerException e ) {					// catch 블록도 실행되지 않음
			System.out.println("숫자로 변환할 수 없습니다.");
		} finally { 										// 예외 처리 후 무조건 실행
			System.out.println("다시 실행하세요.");
		}
		
		
	}

}
