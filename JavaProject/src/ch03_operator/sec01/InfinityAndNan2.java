package ch03_operator.sec01;

public class InfinityAndNan2 {

	public static void main(String[] args) {
		int x=5;
		double y = 0.0;
		
		//0.0으로 연산할 경우 
		double z = x / y;
		System.out.println(z); // Infinity
		System.out.println(Double.isInfinite(z));
		
		System.out.println("---------");
		
		//0.0dmf % 연산한 경우
		double z2 = x % y;
		System.out.println(z2); //NaN
		System.out.println(Double.isNaN(z2));
		
		//알맞은 코드 
		if(Double.isInfinite(z)|| Double.isNaN(z)) {
			System.out.println("값 산출 불가");
		} else System.out.println();
		
	}

}
