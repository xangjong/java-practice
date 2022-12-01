package ch04_control_if_for.sec07;

public class RandomNum1 {

	public static void main(String[] args) {
		// Math.Random() : 메소드 사용해서 랜덤 숫자 생성
	
		for(int i=1; i<=10; i++) { 
			int num=(int)(Math.random() * 10)+1;
			System.out.println(num);
		}
	}
	/* 랜덤 숫자 생성 과정 
	(1) 0 < 랜덤 숫자 < 1 범위에서 실수 형태의 값으로 랜덤 숫자 발생
	(2) 정수 부분의 값 수출 : 곱하기 10 
	(3) 정수 타입으로 변환 : (int)
	(4) 1~10 사이의 정수 발생 : 시작 숫자를 저장 : +1 (기본값 지정)*/
}
