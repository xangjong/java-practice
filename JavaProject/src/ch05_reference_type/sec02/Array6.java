package ch05_reference_type.sec02;

import java.util.Scanner;

public class Array6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num[] = new int[5];
		int max=0;
		
		System.out.println("숫자 입력");
		for(int i=0; i<num.length; i++) { 
			System.out.print("num [" + i + "] = ");
			num[i]=sc.nextInt();
			if(max<num[i]) max =num[i];
		} 
		System.out.print("입력된 값 : ");
			for(int i=0; i<num.length; i++) {
			System.out.print(num[i]+ " ");
		} System.out.print("\n최대값 : " + max);
			sc.close();
	}

}
