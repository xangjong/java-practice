package ch05_reference_type.sec04;

public class ArrayCopy {

	public static void main(String[] args) {
		// 배열 복사 : for문 사용해서 각 원소의 값을 하나씩 복사 
		int[] oldIntArray = {1,2,3};
		int[] newIntArray = new int[5]; //기본 값이 0으로 초기화
		
		//for문 이용해서 배열 복사 
		//복사되지 않은 요소는 기본 초기값(0)이 유지 
		for(int i=0; i<oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
		} for(int i=0; i<newIntArray.length; i++) {
			System.out.print(newIntArray[i] + " ");
		}
		
	}

}