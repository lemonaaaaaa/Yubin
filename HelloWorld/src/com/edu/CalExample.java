package com.edu;

import java.util.Scanner;
public class CalExample {
	

	public static void main(String[] args)   {    //ch(ex : 100초) 입력 ->시분초로 변경하기
		Scanner scn = new Scanner(System.in);
				//int hour, minute, second, inputVal;
		
		
		System.out.println("초 단위 입력(ex: 150)");
		int se=c = scn.nextInt();

		int hour = (sec / 3600);
		int hour2 = ( sec % 3600 );
				int minute = hour2 / 60;
				int second = hour2  % 60;
			
				
		
		
		System.out.println( hour + "시간" + minute + "분" + second + "초 입니다");
		

	
	
	
	scn.close();
	
	
	}
	
	
	

}
