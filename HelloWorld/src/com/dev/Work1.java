package com.dev;

import java.util.Scanner;

public class Work1 {
 public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	
	int num1, num2, num3;
	
	System.out.println("첫번째 숫자를 입력해 주세요");
	num1 = scn.nextInt();
	
	System.out.println("두번째 숫자를 입력해 주세요");
	num2 = scn.nextInt();
	
	if(num1 > num2) {
		num3 = (num1 - num2);
		
	}else
		num3 = (num2 - num1);
	
	System.out.println("두 수의 차는 " + num3 + " 입니다");

	scn.close();
 }
}
