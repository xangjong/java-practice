package ch06_class.sec04;

public class Constructor {
	int x;
	int y;
	
	// 생성자 : 클래스 이름과 동일하고 반환형 없음
	// 객체 생성될 때 자동으로 호출됨
	// 역할 : 멤버 필드 값 초기화
	public Constructor() {
		x = 100;
		System.out.println(x);
	}

}