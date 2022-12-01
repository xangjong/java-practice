package ch06_class.sec05;

public class Share {
	int a; //인스턴스 필드
	static int staticA; // static 필드
	
	public void set(int n) { //인스턴스 메소드  
		a+=n;
		staticA+=n;
	}
	
	public int showA() { //인스턴스 메소드(인스턴스 필드, static 필드 둘 다 사용 가능)  
		return a;
	}
	
	public static int showStaticA() { //static 메소드 (static 필드만 사용가능)
		return staticA;
	}
}
