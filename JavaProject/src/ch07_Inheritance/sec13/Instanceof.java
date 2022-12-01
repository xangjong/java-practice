package ch07_Inheritance.sec13;

public class Instanceof {
	public static void main(String[] args) { 
		Parent p = new Parent();
		System.out.println(p instanceof Parent);
		System.out.println(p instanceof Child);
		
		Child c = new Child();
		System.out.println(c instanceof Parent);
		System.out.println(c instanceof Child);
		
		Parent pc = new Child(); // 자동 타입 변환
		System.out.println(pc instanceof Parent);
		System.out.println(pc instanceof Child);
		
		// pc instanceof Child가 true이므로 pc는 Child 타입으로 강제 타입 변환 가능 
		
		Child c2 = (Child) pc;
		System.out.println("변환 오류 없음");
		
		// pc instanceof Child가 false인 경 p Child 타입으로 강제 타입 변환 불가
		// 예외 발생
		Child c3 = (Child) p;

		
	}
}
