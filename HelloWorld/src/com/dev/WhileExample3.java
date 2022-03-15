package com.dev;

import java.util.Scanner;

public class WhileExample3 {
	public static void main(String[] args) {
		// 입력을 계속 할 수 있는데
		// -1 값을 입력하면 입력멈춤
		// sum 값에 입력하다 멈추고싶을때 -1입력해서 나오기

		// 스캐너 선언. sum(0) 정수선언
		// while 조건 true (무조건 ㅇㅋ)
		// 숫자를 입력하세요 출력
		Scanner scn = new Scanner(System.in);
		int inputVal, sum = 0;
		while (true) {
			
			System.out.println("숫자를 입력해주세요");
			inputVal = scn.nextInt();

			if (inputVal == -1) {
				break;
			} else {
				sum += inputVal;
			}

		}
		System.out.println("총 합계는" + sum + "입니다");
		scn.close();
	}

}
