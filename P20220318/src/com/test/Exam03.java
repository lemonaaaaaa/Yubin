package com.test;

import java.util.Scanner;

//문제3) 정수형배열 선언하고 사용자로 세개의 정수값을 입력받아서 배열에 저장. 제일 큰값을 구하는 코드를 작성.
public class Exam03 {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int[] ary = new int[3];
//		int size = arys.length;

		for (int i = 0; i < 3; i++) {
			System.out.println("수를 입력해 주세요");
			ary[i] = scn.nextInt();
		}

		if (ary[0] > ary[1] && ary[1] > ary[2]) {
			System.out.println("세 수 중 가장 큰 수는 " + ary[0]);
		}
		if (ary[0] > ary[1] && ary[2] > ary[1]) {
			System.out.println("세 수 중 가장 큰 수는 " + ary[0]);
		}
		if (ary[1] > ary[0] && ary[0] > ary[2]) {
			System.out.println("세 수 중 가장 큰 수는 " + ary[1]);
		}
		if (ary[1] > ary[2] && ary[2] > ary[0]) {
			System.out.println("세 수 중 가장 큰 수는 " + ary[1]);
		}
		if (ary[2] > ary[1] && ary[1] > ary[0]) {
			System.out.println("세 수 중 가장 큰 수는 " + ary[2]);
		}
		if (ary[2] > ary[0] && ary[0] > ary[1]) {
			System.out.println("세 수 중 가장 큰 수는 " + ary[2]);
		}

		scn.close();

		
	}
}
