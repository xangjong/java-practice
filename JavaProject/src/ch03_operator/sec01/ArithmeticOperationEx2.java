package ch03_operator.sec01;

import java.util.Scanner;

public class ArithmeticOperationEx2 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int time, hour, min, sec;
		
		System.out.println("시간 입력(초) : ");
		time = sc.nextInt();
		
		
		min = time / 60 ;
		hour = min / 60 ;
		sec = time % 60;
		
		System.out.println( time + "초는" + hour + "시간" + min + "분" + sec + "초 입니다.");
		sc.close();
		
		/*Scanner sc = new Scanner(System.in);
		int hour, min, sec, time;

		System.out.print("시간 입력 (초) : ");
		time = sc.nextInt();

		hour = time / 3600;
		min = time % 3600 / 60;
		sec = time % 60;

		System.out.printf("%d초는 %d시간, %d분, %d초입니다", time, hour, min, sec);

		sc.close();*/
	}

}
