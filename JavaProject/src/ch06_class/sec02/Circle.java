package ch06_class.sec02;

public class Circle {
	// 입력된 반지름을 전달 받아서 멤버 필드 값 설정
	private int radius;
	
	public void setRadius(int radius) { 
		// radius = radius; 멤버 필드 radius에 값 설정 안 됨
		//setRadius의 지역 변수 radius
		//클래스의 멤버 필드 radius 구분하기 위해 : this
		this.radius=radius;
	}
	
	public double getArea() { 
		return radius * radius * Math.PI; 
	}
	
}
