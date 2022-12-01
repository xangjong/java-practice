package ch05_reference_type.sec03;

public class IrregularArray {

	public static void main(String[] args) {
		// 비정방형 배열
		int[][] a = new int[4][];
		a[0] = new int[1]; // 0행에 1개의 원소 생성
		a[1] = new int[2]; // 1행에 2개의 원소 생성
		a[2] = new int[2]; // 2행에 2개의 원소 생성
		a[3] = new int[4]; // 3행에 4개의 원소 생성

		int count = 1;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = count++;

			} // 배열의 각 원소의 값 출력
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("-----------");

		char[][] b = { { 'a' }, { 'b', 'c' }, { 'd', 'e', 'f' } };
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				System.out.print(b[i][j] + " ");
			} System.out.println();
		}
		

		// 각 원소의 값 출력
		// 다음과 같이 출력되도록 초기화하고, 각 원소의 값 출력
		// 홍길동 학생
		// 성춘향 3학년 경영학과
		// 이몽룡 4학년 수학과 A
		
		System.out.println("--------");
		String[][] c = { { "홍길동", "학생" }, { "성춘향", "3학년", "경영학과" }, { "이몽룡", "4학년", "수학과", "A" } };
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				System.out.print(c[i][j] + " ");
			} System.out.println();
		} 
	}

}
