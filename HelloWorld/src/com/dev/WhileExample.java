package com.dev;

import java.util.Scanner;

public class WhileExample {
	public static void main(String[] args) {
		// for
		for (int i = 1; i <= 5; i++) {
			System.out.println("i의 값=>" + i);

		}
//
//		// while
//		int num = 0;
//		while (true) {
//			System.out.println("num의 값=>" + num);
//			num++;
//			if (num > 5) {
//				break; // 반복문을 빠져나옴
//			}
//		}
//
//		while (true) {
//			int rand = (int) (Math.random() * 10) + 1; // 1~10중 임의의 값 뽑다가
//			System.out.println("임의의 생성된 값 : " + rand);
//			if (rand == 8) { // 8이 되면 반복문을 나오게 됨
//				break;
//			}
//
//		}

		// While로 수를 맞출때 까지 계속 반복 실행
		Scanner scn = new Scanner(System.in);
		int randomVal, userVal;
		while (true) {
			randomVal = (int) (Math.random() * 5) + 1;
			System.out.println("임의의 값을 입력(1~5)");
			userVal = scn.nextInt();

			if (randomVal == userVal) {
				System.out.println("맞췄습니다");
				break;
			}

		}

//		int i = 1; // 초기화
//		while (i <= 5) { // 조건식
//			i++;
//			System.out.println("i의 값=>" + i);
//			// 증감식..
//
//		}

		System.out.println("end of program");
	}
}
