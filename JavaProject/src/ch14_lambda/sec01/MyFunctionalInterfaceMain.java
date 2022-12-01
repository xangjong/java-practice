package ch14_lambda.sec01;

public class MyFunctionalInterfaceMain {

	public static void main(String[] args) {
//		매개변수와 리턴값이 없는 람다식
		MyFunctionalInterface fi = () -> {
			String str =  "method call1";
			System.out.println(str);
		};
//		메소드 호출 : 람다식의 중괄호 { ... } 실행
		fi.method();
		
		fi = () -> { System.out.println("method call2");};
		fi.method();
//		
		fi = () -> { System.out.println("method call3");};
		fi.method();
	}

}
