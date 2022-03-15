package com.dev;

import java.util.Scanner;

public class IfExample3 {
	public static void main(String[] args) {
		int ranVal = (int) (Math.random() * 3) + 1; // 0~1사이의 임의의 값을 만들어줌

		int number;

		Scanner scn = new Scanner(System.in);
		System.out.println("1~3 중 하나를 입력해 주세요");
		number = scn.nextInt();

		if (number == ranVal) {
			System.out.println("와 대단해요 맞췄어요 대박대박");
		} else {
			System.out.println("틀렷슴니다");
		}
	}

}
