package ch07_Inheritance.sec06;

public class CalComputerMain {

	public static void main(String[] args) {
		// 메소드 오버라이징 예제 
		int r=10; 
		Calculator cal = new Calculator();
		System.out.println("원 면적 : " + cal.areaCircle(r));
		System.out.println();
		
		Computer com = new Computer();
		System.out.println("원 면적 : " + com.areaCircle(r));
	}

}
