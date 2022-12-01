package ch06_class.sec07;

public class Person {
	//인스턴스 레벨에서의 상수
	final String nation ="Korea"; //고정값으로 초기화
	final String ssn; // 고정값을 주지 않을 때 초기화 안됐다는 오류가 발생하지만, 생성자에서 초기화할 시 오류 사라짐 
	String name;
	
	//생성자에서 전달받은 값으로 ssn 초기화 
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	} //nation ="대한민국" //상수값 변경 불가 (final 필드 수정 불가) 
	
	public void se() { 
		/* 
		 	nation ="대한민국";
			ssn="1234";
		final 필드 수정 불가 
		name="성춘향"; 
		*/
	}

}
