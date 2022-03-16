package com.prod;

import java.util.Scanner;

public class ArrayExample8 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] numbers = new int[2];

		int cent = numbers[0];
		

		System.out.println("첫번째 값을 입력하세용.");
		numbers[0] = scn.nextInt();

		System.out.println("두번째 값을 입력하십쇼.");
		numbers[1] = scn.nextInt();

		if (numbers[0] > numbers[1]) {
			numbers[0] = numbers[1];
			numbers[1] = cent;

			System.out.println(numbers[0] + "그 다음" + cent + "입니다.");

		} else { //num1 다음 num0. 1 >0
			numbers[1] = numbers[0];
			numbers[0] = cent;
			
		System.out.println(numbers[1] + "그 다음" + cent + "입니다.");}

		scn.close();
	}
}
