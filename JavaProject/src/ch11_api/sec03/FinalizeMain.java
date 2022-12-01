package ch11_api.sec03;

public class FinalizeMain {

	public static void main(String[] args) {
		// Finalize 메소드 예제
		Counter counter = null;
		for(int i=1; i<=50; i++) {
			counter = new Counter(i); // 객체 생성
			counter = null; 
			System.gc();
		}
	}

}
// 순서대로 소멸되지 않고 임의로 소멸
// 전부 소멸되는 것이 아니라 메모리 상태를 보고 일부만 소멸 