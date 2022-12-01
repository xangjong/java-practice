package ch13_generic.sec04;

public class GenMethodMain {

	public static void main(String[] args) {
//	제네릭 메소드 예제
//	제네릭 메소드 호출 방법 2가지
//	(1) 호출할 때 구체적으로 타입 지정 
	Box<Integer> box1 = Util.<Integer>boxing(100);
	int intValue = box1.get();
	System.out.println(intValue);
		
		
		
		
//	(2) 타입 생략 
	Box<String>box2 = Util.boxing("홍길동");
	String strValue = box2.get();
	System.out.println(strValue);
	}

}
