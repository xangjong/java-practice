package ch05_reference_type.sec04;

public class Ex8 {

	public static void main(String[] args) {
		// 주어진 배열의 전체 항목의 합과 평균값
		int[][] a = {{95,86}, {83, 92, 96}, {78, 83, 93, 87, 88}};
		int sum=0, count=0;
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
			sum+=a[i][j];
			count++;
			System.out.print(a[i][j] +" ");
			}  System.out.println();
		}	System.out.println("전체 항목의 합 : " + sum);
		System.out.println("평균값 : " + (double)sum/count);
			
		
		
	}

}
