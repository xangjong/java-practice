package ch03_operator.sec01;

public class Printf {

	public static void main(String[] args) {
		// 형식화된 출력 : Printf()사용 
		
				int age =20; 
				String name="홍길동";
				
				System.out.printf("%s, %d", name, age);
				
				System.out.println();
				
				float average=83.3333336f;
				System.out.printf("%.2f", average);

	}

}
