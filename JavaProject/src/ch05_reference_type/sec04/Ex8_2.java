package ch05_reference_type.sec04;

public class Ex8_2 {

	public static void main(String[] args) {
		int num[][] = { { 95, 86 }, { 83, 92, 96 }, { 78, 83, 93, 87, 88 } };
		int sum = 0, cnt = 0;

		for(int i=0; i<num.length; i++) { 
			for(int j=0; j<num[i].length; j++) {
			System.out.print(num[i][j] + " ");
			} System.out.println();
		} 
		
		for (int[] i : num) {
			for (int j : i) {
				cnt++;
				sum += j;
			}
		}

		System.out.println("전체 항목의 합 : " + sum);
		System.out.println("전체 항목 평균값 : " + (double) sum / cnt);

	}

}
