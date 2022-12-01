package ch11_api.sec05;

import java.io.IOException;

public class KeyboardToStringEx {

	public static void main(String[] args) {
		byte[] bytes = new byte[100];
		
		System.out.print("입력 : ");
		try {
			int readByteNo = System.in.read(bytes);
			System.out.println(readByteNo + "바이트");
			String str = new String(bytes, 0, readByteNo);
			System.out.println(str);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
