package ch13_generic.sec04;

public class Util {
//	제네릭 메소드
//	<T> : 타입 파라미터(이 파라미터를 매개변수와 리턴 타입으로 사용하겠다는 의미)
	
	public static <T> Box <T> boxing(T t){
		Box<T> box = new Box<T>();
		box.set(t);
		return box;
	}
}
