package ch13_generic.sec05;

public class Util {
//	제네릭 메소드
	public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
		// p1과 p2의 key 값 비교 결과
		boolean keyComp = p1.getKey().equals(p2.getKey());
		// p1과 p2의 value 값 비교 결과
		boolean valueComp = p1.getValue().equals(p2.getValue());
		return keyComp && valueComp; // 둘 다 참이면 true 반환
	}
}
