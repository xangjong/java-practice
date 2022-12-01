package ch03_operator.sec01;

public class Overflow {

	public static void main(String[] args) {
		// Oveflow 발생
		int x = 1000000; //백만
		int y = 1000000; //백만
		
		int z = x*y;
		
		System.out.println(z); //-727379968
		//10^6 10^60 = 10^12
		
		//결과인 long 타입에 저장해도 Overflow 발생
		
		long z2 = x * y;
		System.out.println(z2);
		
		long a= 1000000;
		long b= 1000000;
		long c = a * b;
		System.out.println(c);
	}

}
