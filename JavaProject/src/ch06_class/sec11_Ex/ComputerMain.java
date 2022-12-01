package ch06_class.sec11_Ex;

public class ComputerMain {

	public static void main(String[] args) {
		// 가변 연자(...) 사용 
		Computer com = new Computer();
		
		int[] value1 = { 1, 2, 3 };
		
		// 메소드호출하면서 기존 배열 전달 : 배열명 사용 
		int result1 = com.sum1(value1); 
		System.out.println("result1 : " + result1);
		
		// 메소드 호출하면서 배열 전달 : 이름 없이 새로 생성된 배열 전달 
		int result2 = com.sum1(new int[] {1, 2, 3, 4, 5});
		System.out.println("result2 : " + result2);
		
		// 호출된 메소드에서 가변 인자(...) 사용해서 전달 받음 
		int result3 = com.sum2(1,2,3); // 정수 3개 전달(배열x)
		System.out.println("result3 : " + result3);

		int result4 = com.sum2(1,2,3,4,5); // 정수 3개 전달(배열x)
		System.out.println("result4 : " + result4);
	}

}
