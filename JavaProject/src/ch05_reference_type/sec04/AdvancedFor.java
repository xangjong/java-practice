package ch05_reference_type.sec04;

public class AdvancedFor {

	public static void main(String[] args) {
		// 향상된 for문 
		int[] scores = {95, 71, 84, 93, 87};
		int sum=0;
		
		for(int score : scores) { //배열의 원소의 크기만큼 반복 수행
			sum+=score;
		}
		System.out.println("총점 : " + sum );
		
		int[ ][ ] array = {
			    { 95, 86 },
			    { 83, 92, 96 },
			    { 78, 83, 93, 87, 88 },
			};
		
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			} System.out.println();
		}
		
	} 

}
