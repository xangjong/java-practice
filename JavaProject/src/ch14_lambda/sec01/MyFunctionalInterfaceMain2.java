package ch14_lambda.sec01;

public class MyFunctionalInterfaceMain2 {

	public static void main(String[] args) {
//		매개변수와 리턴값이 없는 람다식
		MyFunctionalInterface2 fi2;
		
		fi2 = (x) -> { 
			int result = x * 5;
			System.out.println(result);
		};
		fi2.method(2);

//		실행 문장이 1개인 경우
		fi2 = (x) -> { System.out.println(x*5);};
		fi2.method(2);

//		실행 문장이 1개인 경우 중괄호 {} 생략 가능
		fi2 = (x) -> System.out.println(x*5);
		fi2.method(2);
		
//		매개변수가 1개인 경우 괄호 {} 생략 가능
		fi2 = x -> System.out.println(x*5);
		fi2.method(2);
	}
}
