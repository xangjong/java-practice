package ch11_api.sec08;

import java.util.Calendar;

public class CalendarEx {

	public static void main(String[] args) {
//	Calendar 예제
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1 ; // MOUTH는 0부터 반환
		int day = now.get(Calendar.DAY_OF_MONTH);
		
		int week = now.get(Calendar.DAY_OF_WEEK);
		String strWeek = null;
		
		switch(week) {
		case Calendar.MONDAY : strWeek = "월"; break;
		case Calendar.TUESDAY : strWeek = "화"; break;
		case Calendar.WEDNESDAY : strWeek = "수"; break;
		case Calendar.THURSDAY : strWeek = "목"; break;
		case Calendar.FRIDAY : strWeek = "금"; break;
		case Calendar.SATURDAY : strWeek = "토"; break;
		case Calendar.SUNDAY : strWeek = "일"; break;
		default : System.out.println("잘못 입력하였습니다.");
		}
		
		int amPm = now.get(Calendar.AM_PM);
		String strAmPm = null;
		if(amPm == Calendar.AM) {
			strAmPm = "오전";
		} else {
			strAmPm = "오후";
		}
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		System.out.print(year + "년 ");
		System.out.print(month + "월 ");
		System.out.print(day + "일 ");
		System.out.print("\n" +strWeek + "요일 ");
		System.out.print( strAmPm + " ");
		System.out.print("\n" +hour + "시 ");
		System.out.print(minute + "분 ");
		System.out.print(second + "초 ");
		
	}

}
