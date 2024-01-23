package api.util;

import java.util.Date;
import java.text.SimpleDateFormat;

public class DateExample {

	public static void main(String[] args) {
		//void 파라미터 호출시 현재 시간
		Date date = new Date(); //java.util.Date로 임포트, spl아님
		System.out.println(date);
		
		//현재시간 이외의 시간으로 입력하는 경우
		Date date2 = new Date(133, 10, 9, 18, 30,0);
		System.out.println(date2);
		
		//날짜 양식 바구끼
		//1.SimpleDateFormat 객체를 생성하는데, 표현양식을 넣어 생성한다.
		// 예시) 2024년 1월 22일 14시 41분 50초 형식으로 양식 생성
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 dd일 HH시 mm분 ss초");
		//2.sdf.format(Date자료형변수) 를 넣어서 큰솔에 찍는다.
		System.out.println(sdf.format(date));
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("오늘은 E요일입니다. 오늘은 1년 중 D번째 날입니다.");
		System.out.println(sdf2.format(date));
	}

}
