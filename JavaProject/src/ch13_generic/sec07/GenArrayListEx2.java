package ch13_generic.sec07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GenArrayListEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<String> list = new ArrayList<String>();

		for (int i = 0; i < 4; i++) {
			System.out.print("단어를 입력하세요>>");
			list.add(sc.next());
		}

		int max = 0;
		for (String value : list) {
			System.out.print(value + " ");
		}
		for(int i =0; i<list.size(); i++) {
			if(list.get(max).length()<list.get(i).length())
				max = i;
		}
		System.out.println("\n가장 긴 단어는 : " + list.get(max));
		System.out.println("가장 긴 단어의 길이는 : " +list.get(max).length());
	}

}
