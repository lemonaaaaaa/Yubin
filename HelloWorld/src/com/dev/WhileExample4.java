package com.dev;

import java.util.Scanner;

public class WhileExample4 {
	public static void main(String[] args) {
		// 은행 계좌를 만들어서 1을 누르면 입금 2를 누르면 출금 3을 누르면 종료
		// 입금일 경우; 입금액을 입력하세요... 출력 account 값을 누적
		// 출금일 경우; 출금액을 입력하세요... 출력 account 값을 차감
		// 종료일 경우; 프로그램 종료

		Scanner scn = new Scanner(System.in);

		int inputVal, num1, num2;
		int account = 0;
		while (true) {
			System.out.println("무엇을 도와드릴까요? 1: 입금 2: 출금 3: 종료");
			inputVal = scn.nextInt();

			if (inputVal == 1) {
				System.out.println("입금액을 입력해주세요");
				num1 = scn.nextInt();

				account += num1;

				System.out.println("잔액은" + account + "입니다");

			} else if (inputVal == 2) {
				System.out.println("출금액을 입력하세요");
				num2 = scn.nextInt();
				account -= num2;
				if (account < num2) {
					System.out.println("잔액이 부족합니다");
					continue;
				}

				System.out.println("잔액은" + account + "입니다");

			} else if (inputVal == 3) {
				System.out.println("이용해 주셔서 감사합니다");
				break;
			} else
				System.out.println("다시 입력해주세요");
		}

		scn.close();
	}

}
