package ch03_operator.sec01;

import java.text.DecimalFormat;
import java.util.Scanner;
// 자동 import : Ctrl + Shift + O(대문자 O)
public class ArithmeticOperationEx {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int kor, eng, math, total;
		float average;
		
		System.out.println("국어 점수 입력 : " );
		kor =sc.nextInt();
		System.out.println("영어 점수 입력 : ");
		eng =sc.nextInt();
		System.out.println("수학 점수 입력 : ");
		math =sc.nextInt();
		System.out.println("============");
		
		total=(kor + eng + math);
		average= (total / 3.0f);
		// average = (float)total/3;
		// average = total/3f;
		DecimalFormat df = new DecimalFormat("0.00");
		//df.format(average)
		
		
		System.out.println("총점: " + total );		
		System.out.println("평균 : "+ df.format(average));
		
		sc.close();
		
	}

}
