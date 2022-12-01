package ch14_lambda.sec01;

public class MyFunctionalInterfaceMain3 {

	public static void main(String[] args) {
		// 매개변수와 리턴값이 있는 람다식
		MyFunctionalInterface3 fi3;

		fi3 = (x, y) -> { return x + y;};
		
		System.out.println(fi3.method(2, 5));
		
		// return문만 있는 경우 return과 중괄호 {} 생략
		fi3 = (x, y) ->  x + y;
		System.out.println(fi3.method(2, 5));
		
		// Integer 클래스이 sum() 메소드 사용
		fi3 = (a, b) -> Integer.sum(a, b);
        System.out.println(fi3.method(2, 5));
        
        // 아래에 추가한 sum() 메소드 사용
        fi3 = (x, y) -> sum(x, y);
        System.out.println(fi3.method(2, 5));

	}
	
	public static int sum(int x, int y) {
		return x+y;
	}

}