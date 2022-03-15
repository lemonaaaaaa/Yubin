package com.dev;

import java.util.Scanner;

public class ForExample3 {
	public static void main(String[] args) {
		// 입력받는 두 수를 num1, num2

		int num1, num2;
		int num4 = 0;
		
				
		Scanner scn = new Scanner(System.in);
		{
			System.out.println("첫번째 숫자를 입력해 주세요");
			num1 = scn.nextInt();
			System.out.println("두번째 숫자를 입력해 주세요");
			num2 = scn.nextInt();
		}

		for (int i = num1; i <= num2; i++) {
			num4 += i;
		}
		{	System.out.println(num1 + "부터" + num2 + "까지의 합" + num4);

			scn.close();
		
	}
}
}