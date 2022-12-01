package ch07_Inheritance.sec01;

public class DmbCellPhoneMain {

	public static void main(String[] args) {
		// 클래스 상속 예제
		DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "검정", 10);

		// CellPhone으로 상속 받은 필드 사용
		System.out.println("모델 : " + dmbCellPhone.model);
		System.out.println("컬러 : " + dmbCellPhone.color);

		// DmbCellPhone 자신의 필드 사용
		System.out.println("채널 : " + dmbCellPhone.channel);

		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("여보세요");
		dmbCellPhone.receiveVoice("안녕하세요! 저는 홍길동인데요.");
		dmbCellPhone.sendVoice("아~ 예 반갑습니다.");
		dmbCellPhone.hangup();

		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
		dmbCellPhone.powerOff();

	}

}
