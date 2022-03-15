package com.dev;

import java.util.Scanner;

public class ForExample6 {

	public static void main(String[] args) {
		int num1, num2, var=0;
		
		Scanner scn = new Scanner(System.in);
		{System.out.println("첫번째 숫자를 입력해 주세요");
		num1 = scn.nextInt();
		System.out.println("첫번째 숫자보다 큰 수를 입력해 주세요");
		num2 = scn.nextInt();
			
		for(int i = 1; i<= num2; i++)
			if(num1 % i == 0 && num2 % i == 0) {
				var = i;
			}
		
			System.out.println(num1 + " 과 " + num2 + " 의 최대공약수는 " + var );
		
		}
		scn.close();	
	}
}
