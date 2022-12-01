package ch06_class.sec01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Product {
	Scanner sc = new Scanner(System.in);
	private int prdPrice;
	private int prdSold;
	private int prdStock;
	private String prdName;

	public void inputPrdInfo() {
		System.out.println("*****상품 정보 입력*****");
		System.out.print("상품명 : ");
		prdName = sc.next();
		System.out.print("가격 : ");
		prdPrice = sc.nextInt();
		System.out.print("판매 수량 : ");
		prdSold = sc.nextInt();
		System.out.print("재고 수량 : ");
		prdStock = sc.nextInt();
		sc.close();

	}

	public void showPrdInfo() {
		System.out.println("*****상품 정보 출력*****");
		System.out.println("상품명 : " + prdName);
		System.out.println("가격 : " + prdPrice);
		System.out.println("판매 수량 : " + prdSold);
		System.out.println("재고 수량 : " + prdStock);
	}

	public void getSalesAmout() {
		DecimalFormat df = new DecimalFormat("#,###");
		System.out.println("매출 액 : " + df.format(prdPrice * prdSold));
	}

	public void getStockAmout() {
		DecimalFormat df = new DecimalFormat("#,###");
		System.out.println("재고 액 : " + df.format(prdPrice * prdStock));
	}

}
