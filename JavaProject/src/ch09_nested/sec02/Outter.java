package ch09_nested.sec02;

public class Outter {
	public void method2(final int arg1, int arg2) {
		final int localVariable1 = 1;

		// arg1 = 100; 변경 불가
		// localVariable1 = 100; 변경 불가
		
		// arg2 = 200;
		
		class Inner {
			public void method() {
				int result = arg1 + localVariable1 + arg2;
				// 메소드의 매개변수(arg1)와 로컬 변수(localVariable1)에
				// final이 붙었으므로 로컬 클래스에서 사용 가능 
				// arg2 : final이 안 붙었지만 로컬 클래스 내부로 복사되어
				// final 특성을 갖게 되어서 오류가 없음 
			}
		}
	}
}
