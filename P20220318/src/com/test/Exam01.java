package com.test;

//문제1) 정수형 변수 num1, num2 를 선언하고 두 수 중에서 
//큰 수에서 작은 수를 뺀 결과를 저장하는 변수 result.
public class Exam01 {
	public static void main(String[] args) {

		int n1 = 223;
		int n2 = 210;
		int result = 0;

		if (n1 > n2) {
			result = n1 - n2;
			System.out.println(n1 + "에서 " + n2 + "를 뺀 값은 " + result + "입니다");
		} else {
			result = n2 - n1;
			System.out.println(n2 + "에서 " + n1 + "를 뺀 값은 " + result + "입니다");
		}

	}
}
