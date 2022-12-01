package ch08_interface.sec01;

public class SmartPhoneMain {

	public static void main(String[] args) {
		ISmartPhone isp = new SamsungPhone();
		isp.sendCall();
	
		/*ISmartPhone iip = new IPhone();
		iip.sendCall();*/
		
		isp = new IPhone();
		isp.sendCall();
	}

}
