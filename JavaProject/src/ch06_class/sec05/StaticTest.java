package ch06_class.sec05;

public class StaticTest {
	// 인스턴스 멤버 필드와 메소드

	int a;
	// 인스턴스 메소드에서는 인스턴스 필드와 static 필드 모두 사용 가능

	void f1(int x) {a = x;} // 인스턴스 필드 사용 가능

	void f2(int x) {b = x;}

	// static 멤버 필드와 메소드
	static int b;

	// static 메소드는 static 멤버만 접근 가능
	/*
	 * static void s1(int x) {a = x;} // static 메소드는 인스턴스 필드 사용 불가
	
	static void s2(int x) { f1(3);} 
		// static 메소드는 인스턴스 필드 사용 불가 
	*/
	// static 멤버는 접근 가능 
	static void s3(int x) {b=x;} 
	static void s4(int x) {s3(3);}
}
	