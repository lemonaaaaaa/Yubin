package com.dev;

import java.util.Calendar;

public class WeekExample {
	public static void main(String[] args) {

		Week today = Week.MONDAY;

		Calendar day = Calendar.getInstance();
		System.out.println(day.get(Calendar.DAY_OF_WEEK));

		switch(day.get(Calendar.DAY_OF_WEEK)) {
		case1: System.out.println(Week.SUNDAY);
		break;
		case2: System.out.println(Week.MONDAY);
		break;
		case3: System.out.println(Week.TUESDAY);
		break;
		case4: System.out.println(Week.WEDNESDAY);
		break;
		case5: System.out.println(Week.THURSDAY);
		break;
		case6: System.out.println(Week.FRIDAY);
		break;
		case7: System.out.println(Week.SATDAY);
		break;
		}
	}
}
