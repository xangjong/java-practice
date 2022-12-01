package ch18_file.sec01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileInputStreamEx2 {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("src/ch18_file/sec01/FileInputStreamEx2.java");

			int data;
			while ((data = fis.read()) != -1) {
				System.out.println(data);
			}

			System.out.flush();

			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
