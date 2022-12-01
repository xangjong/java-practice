package ch10_exception.sec02;

public class TryCatchEx2 {

	public static void main(String[] args) {
		// try ~ catch 예제
			int[] arr = {1, 2, 3};

		try {
			System.out.println(arr[5]);
		} catch (Exception e) {
			System.out.println("배열의 인덱스 범위를 벗어났습니다.");
		} 

	}

}
