package com.edu.api;

//import java.time.Year;
import java.util.Calendar;

public class CalendarExample {
	public static void main(String[] args) {

//		int year = 2022;
//		int month = 5; // 6월

		creatCalendar(2022, 3);

	}

//메소드 형성
	public static void creatCalendar(int year, int month) {
		month = month - 1;
		Calendar today = Calendar.getInstance();

		today.set(year, month, 1);
		System.out.println("올해는 : " + today.get(Calendar.YEAR));
		// today는 get이란 메소드로 캘린더의 연도를 읽어오겟다
		System.out.println("이번달은 : " + (today.get(Calendar.MONTH) + 1));
		// 1월 = 0 2월 이기 때문에 1 더해줘씀
		System.out.println("오늘은 : " + today.get(Calendar.DATE));
		System.out.println("요일정보 : " + today.get(Calendar.DAY_OF_WEEK));
		// 일 =1 월 2= 화 =3 etc
		System.out.println("마지막날의 정보 : " + today.getActualMaximum(Calendar.DATE));

		int gapday = today.get(Calendar.DAY_OF_WEEK);
		int lastDate = today.getActualMaximum(Calendar.DATE);

		// 요일정보출력
		String[] days = { "Sun", "Mon", "Tue", "Wed", "Thr", "Fri", "Sat", "\r\n" };
		for (int i = 0; i < days.length; i++) {
			System.out.printf("%4s", days[i]);// %4 : 뒤에있는 문자를 4개 공간만큼 차지하고
		}
		System.out.println();// 1일의 위치지정
		for (int i = 1; i < gapday; i++) {
			System.out.printf("%4s", "");
		} // 날짜를 출력
		for (int i = 1; i <= lastDate; i++) {
			System.out.printf("%4d", i);
			if ((i + gapday - 1) % 7 == 0) {
				System.out.println("");
			}
		}
		System.out.println("\r\n");
		System.out.println("\r\n 끝!");

		// 수연언니는 똑똑지니어스

	}
}
