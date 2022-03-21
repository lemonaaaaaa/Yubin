package com.edu.except;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExample {
	public static void main(String[] args) {
		// 오류: Error-운영체제에 에러가 있어서 프로그램 실행시 실행되기 전에 에러가 되버림-우리가 손댈수업슴
		// 오류: Exception-정상적으로 실행되는데 잘못된 케이스 실행시 에러나게 하겟따!

		try {
			double result = 13 / 0; // 13/0하면 익셉션 에러남.
			System.out.println(result);
		} catch (ArithmeticException e) { //이거넣으면 에러로 안밝혀짐.
//			e.printStackTrace();
			System.out.println("0으로 나눌수 없습니다. 이 수포자야");

		}
		Scanner scn = new Scanner(System.in);
		System.out.println("숫자를 입력하거라");
		try {
			int menu = scn.nextInt();
		}catch(InputMismatchException e) {
			System.out.println("멍청아 숫자넣으라구");
		}
		
		int menu = scn.nextInt();
		
		System.out.println("end of program");
	}
}
