package ch07_Inheritance.sec04;

public class PartTime extends Worker {
	int hours;
	int uniPrice;

	public PartTime(String joominNo, String name, int hours, int uniPrice) {
		super(joominNo, name);
		this.hours = hours;
		this.uniPrice = uniPrice;

	}

	public int caculatePay() {
		return hours * uniPrice;
	}

	@Override
	public String toString() {
		return super.toString() + 
				"\n근무 시간 : " + hours + "시간\n" +
				"시급 : " + uniPrice + "원\n" + 
				"총 지불액 : " + caculatePay() + "원\n";
	}
}
