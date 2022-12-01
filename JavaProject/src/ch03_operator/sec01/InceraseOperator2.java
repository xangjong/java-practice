package ch03_operator.sec01;

public class InceraseOperator2 {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;

		x++;
		++x;
		System.out.println("x = " + x); // 12
		
		System.out.println("------------");

		y--;
		--y;
		System.out.println("y = " + y); // 8
		
		System.out.println("------------");

		z = x++;
		System.out.println("z = " + z); // 12
		System.out.println("x = " + x); // 13
		
		System.out.println("------------");

		z = ++x;
		System.out.println("z = " + z); // 14
		System.out.println("x = " + x); // 14
		
		System.out.println("------------");
	
		z = ++x + y++;
		System.out.println("z = " + z); // 15 + 8 = 23
		System.out.println("x = " + x); // 15
		System.out.println("y = " + y); // 9
		
		
	}

}
