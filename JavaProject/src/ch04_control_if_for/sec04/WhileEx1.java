package ch04_control_if_for.sec04;

public class WhileEx1 {

	public static void main(String[] args) {
	int i = 1, sum = 0;
		
		while (i <= 100) {
			if (i % 2 == 0)
				sum += i;
			
			i++;
		}
		
		System.out.println("i : " + i);
		//System.out.println("1~100 짝수의 합: " + sum);
		System.out.println("1 ~ " + (i - 1) + " 짝수의 합 : " + sum );
		
		System.out.println("-----------------------------");
		
		int j = 0;
		sum = 0;
		
		while(j<=100) {			
			sum +=j;	
			j +=2;
		}
		
		System.out.println("j : " + j);
		System.out.println("1 ~ " + (j - 2) + " 짝수의 합 : " + sum );
	}

}