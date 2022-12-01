package ch03_operator.sec01;

public class IncreaseOperator1 {

	public static void main(String[] args) {
		/* 연산식에 증감 연산자만 있는 경우에는
		변수의 앞이나 뒤 어디든 위치해도 결과 동일*/
		int x =10;
		x++;
		System.out.println(x); //11
		
		int y =20; 
		++y; // 1 증가
		System.out.println(y);
		
		System.out.println("================");
		
	/*	위치 주의 
		변수의 값을 먼저 사용하고 나중에 증가할 것인지
		먼저 증가해서 증가된 값을 사용할 것인지 주의*/
		
		x = 1;
		y = 1;
		
		y = ++x; // 먼저 1 증가해서 2가 된 값을 y에 저장
		
		System.out.println(x); //2
		System.out.println(y); //2 
		
		System.out.println("================");

		x = 1;
		y = 1;
		
		y=x++; // 먼저 x의 값 1을 y에 저장하고, x 값 증가
		
		System.out.println(x); 
		System.out.println(y); 
		
		System.out.println("================");
		
		x = 1;
		y = 1;
		
		int result1 = ++x +10; // 먼저 증가해서 2가된 후 10과 더해서 result1에 저장 
		int result2 = y++ +10; // 먼저 y의 값(1)과 10을 더해서 result2에 저장된 후 y값 증가
		
		System.out.println(result1);
		System.out.println(result2);
				
	}

}
