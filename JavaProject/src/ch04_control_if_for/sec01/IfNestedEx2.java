package ch04_control_if_for.sec01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class IfNestedEx2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#,###");
		
		System.out.println("*****상품 정보*****");
		System.out.println("1. 노트북 : 1,200,000원" );
		System.out.println("2. 디지털카메라 : 400,000원");
		System.out.println("***************");
		
		int prdNum, prdQty, price, amount, dis, total;
		String prdName;
		
		System.out.print("상품번호 입력 : ");
		prdNum=sc.nextInt();
		
		if((prdNum == 1) || (prdNum ==2)) { 
			System.out.print("주문수량 입력 : ");
			prdQty=sc.nextInt();
			if(prdNum ==1) { 
				prdName="노트북";
				price=1200000;
				
			} else { 
				prdName="디지털카메라";
				price=400000;
			}
			amount = price * prdQty;
			if(amount>=1000000) { 
				dis = (int)(amount * 0.1);
			} 
			else if(amount>=500000) { 
				dis = (int)(amount * 0.05);
			} else { 
				dis =0;
			}
			total = amount + dis;
			System.out.println("*****주문 내용*****");
			System.out.println("상품명 : " + prdName);
			System.out.println("가격 : " + df.format(price) + "원");
			System.out.println("주문 수량 : " + prdQty + "개");
			System.out.println("주문액 : " + df.format(amount) + "원");
			System.out.println("할인액 : " + df.format(dis) + "원");
			System.out.println("총 지불액 : " + df.format(total) + "원");

		} else { 
			System.out.println("잘못 입력하였습니다.\n 종료합니다.");
		}
		
	
		prdQty=sc.nextInt();
			
		
		sc.close();
		
	}

}
