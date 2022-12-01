package ch11_api.sec06;

public class StringSplitEx {
	public static void main(String[] args) {
//		split() 예제
		
		String text ="홍길동&이몽룡,성춘향,김자바-박자바";
		String[] names = text.split("&|,|-");
		
		for (String name : names) { 
			System.out.println(name);
		}
		
		String tel = "010-1234-5678";
		String[] telNums = tel.split("-");
		
		for(String num : telNums) { 
			System.out.println(num);
		}
		
	}
}
