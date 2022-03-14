package com.edu;

import java.util.Scanner;

public class ScannerExample { // com.edu.ScanneExample
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("첫번째 숫자를 입력하세요");
		int val = scn.nextInt(); // 사용자의 입력값을 읽어 val값으로 인식
		System.out.println("두번째 숫자를 입력하세요");
		int val2 = scn.nextInt(); // 사용자의 입력값을 읽어 va12값으로 인식

		
		System.out.println("두 수의 합은" + (val + val2) + "입니다");
		
		// int val3 = val + val2;

		// if(val % 2 == 0) {
		//System.out.println("짝수입니다");
		// }

		// if(val % 2 == 1) {
		//System.out.println("홀수입니다");
		// }

		scn.close();

	}

}
