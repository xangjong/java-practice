
package ch05_reference_type.sec02;

public class Array2 {

	public static void main(String[] args) {
		// 배열 
		int[] b = new int[5]; //선언과 동시에 메모리 할당 
		String[] flowers = {"해바라기", "장미", "진달래"}; //초기화 리스트
		//for문을 사용하여 배열 b의 각 원소 i 값에 저장 
		for(int i=0; i<b.length; i++) { 
			b[i] = i;
		
		//배열 b의 각 원소의 값 출력 : b[0] = 0
		} for(int i=0; i<b.length; i++)
		System.out.println("b[" + i + "] = " + b[i]);
		//배열 flowers의 각 원소의 값 출력 flowers[0] = 해바라기
		for(int i=0; i<b.length; i++)
		System.out.println("flowers : " + flowers[i]);
	} 

}
