package ch18_file.sec01;

import java.io.FileOutputStream;

public class FileOutputStreamEx {

	public static void main(String[] args) {
//		FileOutputStream 예제
		
		FileOutputStream os = null;
		
		try { 
			// 파일이 존재하지 않으면 새로 만들고
			// 존재하면 이전 내용 덮어씀
			os = new FileOutputStream("src/ch18_file/sec01/fileWrite.txt", true);
	
		// 이전 내용 덮어쓰지 않고 맨 뒤에 추가할 수 있도록 추가모드(append 모드)로 파일 열고 
		// 맨 뒷 부분에 추가로 입력
			
			
		// 출력말 문자열	
		String srtOut = "안녕하세요. 파일로 출력합니다. ";
		byte[] bs = srtOut.getBytes();
			
		// 파일에 쓰기
		os.write(bs);
		os.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
