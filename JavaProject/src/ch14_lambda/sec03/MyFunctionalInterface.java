package ch14_lambda.sec03;

// 추상 메소드가 1개만 존재해야 함
@FunctionalInterface
public interface MyFunctionalInterface {
	// 1. 매개변수와 리턴값 없음
	public void method();
}