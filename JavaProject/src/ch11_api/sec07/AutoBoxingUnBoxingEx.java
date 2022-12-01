package ch11_api.sec07;

public class AutoBoxingUnBoxingEx {

	public static void main(String[] args) {
		// 자동 박싱 / 언박싱 예제 
		
		// 자동 Boxing
		Integer obj = 100; // 자동 박싱
		System.out.println(obj.intValue());

//		대입 시 자동 UnBoxing
		int value =obj;
		System.out.println(value);
		
//		연산 시 자동 UnBoxing
		int result = obj + 100;
		System.out.println(result);
	}

}
