package ch13_generic.sec08;

import java.util.ArrayList;
import java.util.Iterator;

public class ProductMain {

	public static void main(String[] args) {
		ArrayList<Product> list = new ArrayList<Product>();

		Product pd1 = new Product("노트북", 30000, 10);
		Product pd2 = new Product("컴퓨터", 20000, 8);
		Product pd3 = new Product("마우스", 10000, 5);

		list.add(pd1);
		list.add(pd2);
		list.add(pd3);

		System.out.println(list.size());

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));

		}
		System.out.println();
		
		for(Product p : list) { 
			System.out.println(p);
		}
		
		System.out.println();
		
		Iterator<Product> p = list.iterator();
		while(p.hasNext()) {
			System.out.println(p.next());
		}
	}

}
