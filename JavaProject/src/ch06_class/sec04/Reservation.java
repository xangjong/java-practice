package ch06_class.sec04;

public class Reservation {
	private String air;
	private String name;
	private String arrival;
	private String departure;
	private int price;
	private String seatNum;
	
	public Reservation(String air, String name, String arrival,
			String departure,int price,String seatNum ) {
		this.air=air;
		this.name=name;
		this.arrival=arrival;
		this.departure=departure;
		this.price=price;
		this.seatNum=seatNum;
	} //참고 : 매개변수 있는 생성자 자동 삽입 
	// 초기화 메뉴 Source / Generate Constructor using Fields…
	public void showRsvInfo() { 
		System.out.println("****항공권 예약 정보*******");
		System.out.println("항공기 : " + air );
		System.out.println("예약자 : " + name );
		System.out.println("출발지 : " + arrival );
		System.out.println("도착지 : " + departure );
		System.out.println("금액 : " + price );
		System.out.println("좌석번호 : " + seatNum );
	}
	
	
}
