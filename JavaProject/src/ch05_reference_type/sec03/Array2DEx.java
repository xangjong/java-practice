package ch05_reference_type.sec03;

public class Array2DEx {

	public static void main(String[] args) {
		// 2차원 배열을 선언 및 초기화
		// 각 행의 합을 구해서 출력
		// 총 합
		int total = 0;
		int num[][] = { { 5, 9, 3 }, { 7, 4, 8 }, { 9, 5, 7 }, { 7, 8, 9 }, { 6, 9, 4 } };
		System.out.println("각 행의 합 출력");
		for (int i = 0; i < num.length; i++) {
			int sum = 0;
			for (int j = 0; j < num[i].length; j++) {
				sum += num[i][j];
				System.out.print(num[i][j] + "\t");
			}
			total +=sum;
			System.out.println(i + "행의 합 : " + sum);
		} System.out.println("배열의 총합 : " + total);

	}

}
