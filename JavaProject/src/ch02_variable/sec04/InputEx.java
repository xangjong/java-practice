package ch02_variable.sec04;

import java.util.Scanner;

public class InputEx {

	public static void main(String[] args) {
		//
		Scanner sc = new Scanner(System.in);
		String name; 
		int grade; 
		Double score;
		String credit;
		char credit2;
		
		System.out.println("이름 입력 : ");
		name = sc.next();
		
		System.out.println("학년 입력 : ");
		grade =sc.nextInt();
		
		System.out.println("점수 입력 : ");
		score = sc.nextDouble();
		// nextFloat() 사용 가능 
		
		System.out.println("학점 입력 : ");
		credit =sc.next();
		
		System.out.println("학점2 입력 : ");
		String g =sc.next();
		credit2 = g.charAt(0);
		// : 문자열에서 첫 번째 문자 반환
		
		
		
		System.out.println("==========");
		
		System.out.println("이름 : " + name );
		System.out.println("학년 : " + grade);
		System.out.println("점수 : " + score);
		System.out.println("학점 : " + credit);
		System.out.println("학점2 : " + credit2);
		
		/* 앞에서 next()로 입력받아 grade2로 저장했을 때 
		학점 값은 grade2로 저장되고 엔터값이 버퍼에 그대로 남아 있어서
		다음 값으로 읽어 들이기 때문에
		버퍼에 남아 있는 값을 읽어들여서 버퍼 비움 */ 
		sc.nextLine();
		
		String address;
		
		System.out.println("주소 입력 : ");
		address =sc.nextLine();
		System.out.println("주소 :" + address);
		
		sc.close();
		
	}

}
