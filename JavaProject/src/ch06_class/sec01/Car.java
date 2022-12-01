package ch06_class.sec01;

public class Car {
	// 클래스의 멤버 필드 - 데이터
	// 자동차가 가질 수 있는 데이터 : 차량번호, 차종, 제조사,연식, 배기량
	//외부에서 필드 데이터를 볼 수 없도록 막아 놓음 : private
	private String carNo;
	/*private String carName;
	private String carMaker;
	private int carYear;
	private int carCC;*/

	// 클래스의 멤버 메소드 - 기능 (작업)
	//차량 정보 조회 
	public void showCarInfo() { 
		System.out.println("차량 번호 " + carNo);
	}
	
	//carNo 멤버 필드에 값 저장 
	public void selCarNo(String no) { 
		carNo = no;
	}
}
