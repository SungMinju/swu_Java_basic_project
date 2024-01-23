package api.util;

import java.util.Calendar;

public class CalendarExample {

	public static void main(String[] args) {
		//new 키워드로 객체를 생성하지 않음에 주의
		Calendar cl = Calendar.getInstance();
		
		int year = cl.get(Calendar.YEAR);
		int month = cl.get(Calendar.MONTH)+1; //월은 1월이 0부터 11이 12월까지
		int day = cl.get(Calendar.DAY_OF_MONTH);
		int week = cl.get(Calendar.DAY_OF_WEEK); //일요일이 숫자 1
		
		String strweek = null;
		
		switch(week) {
		case Calendar.MONDAY: strweek = "월"; break;
		case Calendar.TUESDAY: strweek = "화"; break;
		case Calendar.WEDNESDAY: strweek = "수"; break;
		case Calendar.THURSDAY: strweek = "목"; break;
		case Calendar.FRIDAY: strweek = "금"; break;
		case Calendar.SATURDAY: strweek = "토"; break;
		case Calendar.SUNDAY: strweek = "일"; break;
		default : strweek = "일"; break;
		}
		int hour = cl.get(Calendar.HOUR);
		int minute = cl.get(Calendar.MINUTE);
		int second = cl.get(Calendar.SECOND);
		
		System.out.println("오늘은"+year+"년"+month+"월"+day+"일입니다.");
		System.out.println(hour+"시"+minute+"분"+second+"초"+strweek+"요일입니다.");
		
	}

}
