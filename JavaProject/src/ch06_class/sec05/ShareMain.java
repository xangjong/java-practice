package ch06_class.sec05;

public class ShareMain {

	public static void main(String[] args) {
		Share s1, s2;
		
		s1 = new Share();
		s1.set(5); //s1이 staticA에 5를 더함

		System.out.println("s1의 a : " + s1.showA());
		System.out.println("staticA : " + Share.showStaticA());
		
		s2 = new Share();
		s2.set(100); //s2이 staticA에 100을 더함
		
		System.out.println("s2의 a : " + s2.showA());
		System.out.println("staticA : " + Share.showStaticA());
		
	}

}
