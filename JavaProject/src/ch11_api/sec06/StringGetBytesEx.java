package ch11_api.sec06;

public class StringGetBytesEx {

	public static void main(String[] args) {
//		getBytes() 예제
		String str ="안녕하세요";
		
		byte[] bytes1 = str.getBytes();
		System.out.println("bytes1.length : " + bytes1.length);
		
		String str1 = new String(bytes1);
		System.out.println("bytes1 -> String : " + str1);
		
		/*byte[] bytes2 = str.getBytes("EUC-KR"); // 한글 2바이트
		System.out.println("bytes2.length : " + bytes2.length);
		
		byte[] bytes3 = str.getBytes("UTF-8");	// 한글 3바이트
		System.out.println("bytes3.length : " + bytes3.length);*/

		
//		msp949 : 한글 2바이트 
//		맥은 한글 3바이트, utf-8 : 3바이트 
	}

}
