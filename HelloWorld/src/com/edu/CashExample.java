package com.edu;

import java.util.Scanner;

public class CashExample {
	public static void main(String[] args)  {
		// 2개 값을 입력
		int price, cash, plus, yougot;
		
		Scanner scn = new Scanner(System.in);
		//가격을  입력하세요
		System.out.println("가격을 입력해주세요"); // 5500원
		 price = scn.nextInt();
		
		System.out.println("고객님이 내신 금액을 입력해주세요"); //10000원
		cash = scn.nextInt();
		
		plus = price *1 / 11;
		yougot = cash - price; 
		
		
		//하나는 상품의 부가세 500, 거스름돈 4500
		System.out.println("부가세" + plus + "를 포함하여 거스름돈은 " + yougot + "입니다." );
		
	}
}
