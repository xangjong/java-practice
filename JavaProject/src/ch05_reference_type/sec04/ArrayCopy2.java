package ch05_reference_type.sec04;

public class ArrayCopy2 {

	public static void main(String[] args) {
		// 배열 복사 - System.arrayCopy() 메소드 이용
		String[] oldArray = {"java", "array", "copy"};
		String[] newArray = new String[5]; //기본값이 null로 초기화됨
		
		//System.arrayCopy(원본배열, 시작인덱스, 대상배열, 시작인덱스, 복사할 항목 개수)
		//복사되지 않은 요소는 기본 초기값(null) 유지 
		System.arraycopy(oldArray, 0, newArray, 0, oldArray.length);
		
		for(int i=0; i<newArray.length; i++) { 
			System.out.print(newArray[i]+ " ");
		}
	}

}
