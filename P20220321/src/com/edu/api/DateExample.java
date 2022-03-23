package com.edu.api;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

public class DateExample {
	public static void main(String[] args) {

//		Date today = new Date(); // cntr shift o java utill
//		System.out.println(today);
//
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년MM월dd일hh시mm분ss초");
//		System.out.println(sdf.format(today)); // 실행시점의 값을 가져옴

		Date today = new Date("2022/01/01 00:00:00"); // cntr shift o java utill
		today.setYear(1); //기준이 1900년
		System.out.println(today);

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년MM월dd일hh시mm분ss초");
		System.out.println(sdf.format(today)); // 지정시점 + 값을 가져옴
		
		
		LocalDateTime time = LocalDateTime.now();
		System.out.println(time.getYear() + "년");

	}

}
