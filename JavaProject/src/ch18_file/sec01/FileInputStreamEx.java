package ch18_file.sec01;

import java.io.FileInputStream;

public class FileInputStreamEx {

	public static void main(String[] args) {
//		FileInputStreamEx 예제
		try {
			FileInputStream fis = new FileInputStream("C:/test/Dir/file2.txt");
			
			/*	while(true) {
					int data = fis.read();
					
					if(data ==1 ) break;
					System.out.println((char)data);
			}*/
			
			int data;
			while((data = fis.read()) != -1) {
				System.out.println(data);
			}
			
			System.out.flush();
			// flush(): 버퍼에 남아 있는 데이터를 모두 출력시키고 버퍼를 비우는 역할
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
