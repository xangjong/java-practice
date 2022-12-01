package ch11_api.sec08;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatEx {

	public static void main(String[] args) {

//		날짜 포맷 예
		Date now = new Date();
		
//		단순 출력할 때는 Date 타입 now 가능, 문자열 반환해서 출력도 가능
		System.out.println(now);
		System.out.println(now.toString());

//		String 타입의 변수에 저장할 때는 : String today =now; 
//		Date 타입을 String 타입으로 반환할 수 없다는 오류 발생
//		String 타입으로 변환 필요 : now.toString()
		String today = now.toString();
		System.out.println(today);
		
//		SimpleDateFormat 클래스 이용해서 출력 형태 지정
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("오늘은 E요일");
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("올 해의 D번째 날");
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("이 달 d번째 날");
		System.out.println(sdf.format(now));
	}

}
