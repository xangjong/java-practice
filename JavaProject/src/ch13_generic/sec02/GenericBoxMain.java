package ch13_generic.sec02;

public class GenericBoxMain {

	public static void main(String[] args) {
		// 제네릭 타입 예제
		// 구체적 타입 지정 : String
		
		Box<String> box1 = new Box<String>();
		box1.set("hello");
		String str = box1.get();
		System.out.println(str);
		
		// 구체적 타입 : Integer 
		Box<Integer> box2 = new Box<Integer>();
		box2.set(6);
		int value = box2.get();
		System.out.println(value);
		
	}

}
