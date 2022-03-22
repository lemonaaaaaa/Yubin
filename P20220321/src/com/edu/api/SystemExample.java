package com.edu.api;

public class SystemExample {
	public static void main(String[] args) {

		System.out.println("start");
	//	System.exit(0);//프로그램 강제종료
		System.out.println("end");
		
		long currentTime = System.currentTimeMillis();
		//현재시간을 1970년 1월 1일 0시를 기준으로 1초가 지날 때마다
		//누적계산하는 값을 출력
		System.out.println(currentTime);//24*60*60*1000 = 하루
		long days = currentTime/(24*60*60*1000); //~몇일
		System.out.println(days); //19073일
		long years = 19073/365;
		System.out.println(years); // 52년
		
		currentTime = System.currentTimeMillis();
		long sum = 0;
		for(int i = 0; i <100000; i++) {
			sum += i;
		}
		System.out.println("summary: "+ sum);
		long endTime = System.currentTimeMillis();
		
		System.out.println("연산에 걸린 시간은 : " + (endTime - currentTime + "msec"));//2 밀리세컨
		
	}
}
